package ninja1s.starter2;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(StarterMod.MODID)
public class StarterMod {

    public static final String MODID = "starter2";

    private static final Logger LOGGER = LogManager.getLogger();

    public StarterMod() {
        LOGGER.debug("hello from starter mod");
    }
}
