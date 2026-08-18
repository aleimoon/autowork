package org.prism.autowork;

import net.neoforged.neoforge.common.ModConfigSpec;

public class ClientConfig {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.BooleanValue CRUSHING_HUD_HELPER = BUILDER
            .define("crushingHudHelper", true);
    public static final ModConfigSpec.BooleanValue BUFFER_HUD_RENDER = BUILDER
            .define("bufferHudRender", true);

    public static final ModConfigSpec.BooleanValue HOLDER_DECORATIONS_RENDER = BUILDER
            .define("holderDecorRender", true);

    public static final ModConfigSpec.BooleanValue BLOCKHELP_TOOLTIPS = BUILDER
            .define("blockhelpTooltips", true);

    static final ModConfigSpec SPEC = BUILDER.build();
}
