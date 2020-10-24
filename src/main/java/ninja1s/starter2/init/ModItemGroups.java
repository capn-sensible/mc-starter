package ninja1s.starter2.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import ninja1s.starter2.StarterMod;

import java.util.function.Supplier;

public class ModItemGroups {

    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(StarterMod.MODID,
            () -> new ItemStack(ModItems.EXAMPLE_ITEM));

    public static class ModItemGroup extends ItemGroup {

        private final Supplier<ItemStack> iconSupplier;

        public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        public ItemStack createIcon() {
            return iconSupplier.get();
        }
    }
}
