package de.artemis.pocketlings;

import com.mojang.logging.LogUtils;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(Pocketlings.MOD_ID)
public final class Pocketlings {
    public static final String MOD_ID = "pocketlings";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Pocketlings() {
        LOGGER.info("Initializing Pocketlings");
    }
}
