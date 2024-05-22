package gay.pridecraft.joymod.block;

import gay.pridecraft.joymod.JoyMod;
import gay.pridecraft.joymod.block.custom.CustomBedBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CandleBlock;
import net.minecraft.block.CandleCakeBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block GAY_BED = registerBlock("gay_bed",
            new CustomBedBlock(FabricBlockSettings.copyOf(Blocks.RED_BED)));

    public static final Block ENBY_BED = registerBlock("enby_bed",
            new CustomBedBlock(FabricBlockSettings.copyOf(Blocks.BLACK_BED)));

    public static final Block INTERSEX_BED = registerBlock("intersex_bed",
            new CustomBedBlock(FabricBlockSettings.copyOf(Blocks.GREEN_BED)));

    public static final Block AGENDER_BED = registerBlock("agender_bed",
            new CustomBedBlock(FabricBlockSettings.copyOf(Blocks.BROWN_BED)));

    public static final Block BIGENDER_BED = registerBlock("bigender_bed",
            new CustomBedBlock(FabricBlockSettings.copyOf(Blocks.BLUE_BED)));

    public static final Block BISEXUAL_BED = registerBlock("bisexual_bed",
            new CustomBedBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_BED)));

    public static final Block MLM_BED = registerBlock("mlm_bed",
            new CustomBedBlock(FabricBlockSettings.copyOf(Blocks.CYAN_BED)));

    public static final Block ACE_BED = registerBlock("ace_bed",
            new CustomBedBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_BED)));

    public static final Block ARO_BED = registerBlock("aro_bed",
            new CustomBedBlock(FabricBlockSettings.copyOf(Blocks.GRAY_BED)));

    public static final Block APLATONIC_BED = registerBlock("aplatonic_bed",
            new CustomBedBlock(FabricBlockSettings.copyOf(Blocks.PINK_BED)));

    public static final Block GENDER_FLUID_BED = registerBlock("gender_fluid_bed",
            new CustomBedBlock(FabricBlockSettings.copyOf(Blocks.LIME_BED)));

    public static final Block PAN_BED = registerBlock("pan_bed",
            new CustomBedBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_BED)));

    public static final Block TRANS_BED = registerBlock("trans_bed",
            new CustomBedBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_BED)));

    public static final Block AROACE_BED = registerBlock("aroace_bed",
            new CustomBedBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_BED)));

    public static final Block LESBIAN_BED = registerBlock("lesbian_bed",
            new CustomBedBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_BED)));

    public static final Block PROGRESS_BED = registerBlock("progress_bed",
            new CustomBedBlock(FabricBlockSettings.copyOf(Blocks.WHITE_BED)));

    public static final Block GAY_CANDLE = registerBlock("gay_candle",
            new CandleBlock(FabricBlockSettings.copyOf(Blocks.CANDLE)));

    public static final Block ENBY_CANDLE = registerBlock("enby_candle",
            new CandleBlock(FabricBlockSettings.copyOf(Blocks.CANDLE)));

    public static final Block INTERSEX_CANDLE = registerBlock("intersex_candle",
            new CandleBlock(FabricBlockSettings.copyOf(Blocks.CANDLE)));

    public static final Block AGENDER_CANDLE = registerBlock("agender_candle",
            new CandleBlock(FabricBlockSettings.copyOf(Blocks.CANDLE)));

    public static final Block BIGENDER_CANDLE = registerBlock("bigender_candle",
            new CandleBlock(FabricBlockSettings.copyOf(Blocks.CANDLE)));

    public static final Block BISEXUAL_CANDLE = registerBlock("bisexual_candle",
            new CandleBlock(FabricBlockSettings.copyOf(Blocks.CANDLE)));

    public static final Block MLM_CANDLE = registerBlock("mlm_candle",
            new CandleBlock(FabricBlockSettings.copyOf(Blocks.CANDLE)));

    public static final Block ACE_CANDLE = registerBlock("ace_candle",
            new CandleBlock(FabricBlockSettings.copyOf(Blocks.CANDLE)));

    public static final Block ARO_CANDLE = registerBlock("aro_candle",
            new CandleBlock(FabricBlockSettings.copyOf(Blocks.CANDLE)));

    public static final Block APLATONIC_CANDLE = registerBlock("aplatonic_candle",
            new CandleBlock(FabricBlockSettings.copyOf(Blocks.CANDLE)));

    public static final Block GENDER_FLUID_CANDLE = registerBlock("gender_fluid_candle",
            new CandleBlock(FabricBlockSettings.copyOf(Blocks.CANDLE)));

    public static final Block PAN_CANDLE = registerBlock("pan_candle",
            new CandleBlock(FabricBlockSettings.copyOf(Blocks.CANDLE)));

    public static final Block TRANS_CANDLE = registerBlock("trans_candle",
            new CandleBlock(FabricBlockSettings.copyOf(Blocks.CANDLE)));

    public static final Block AROACE_CANDLE = registerBlock("aroace_candle",
            new CandleBlock(FabricBlockSettings.copyOf(Blocks.CANDLE)));

    public static final Block LESBIAN_CANDLE = registerBlock("lesbian_candle",
            new CandleBlock(FabricBlockSettings.copyOf(Blocks.CANDLE)));

    public static final Block PROGRESS_CANDLE = registerBlock("progress_candle",
            new CandleBlock(FabricBlockSettings.copyOf(Blocks.CANDLE)));

    public static final Block GAY_CANDLE_CAKE = registerBlock("gay_candle_cake",
            new CandleCakeBlock(GAY_CANDLE, FabricBlockSettings.copyOf(Blocks.CANDLE_CAKE)));

    public static final Block ENBY_CANDLE_CAKE = registerBlock("enby_candle_cake",
            new CandleCakeBlock(ENBY_CANDLE, FabricBlockSettings.copyOf(Blocks.CANDLE_CAKE)));

    public static final Block INTERSEX_CANDLE_CAKE = registerBlock("intersex_candle_cake",
            new CandleCakeBlock(INTERSEX_CANDLE, FabricBlockSettings.copyOf(Blocks.CANDLE_CAKE)));

    public static final Block AGENDER_CANDLE_CAKE = registerBlock("agender_candle_cake",
            new CandleCakeBlock(AGENDER_CANDLE, FabricBlockSettings.copyOf(Blocks.CANDLE_CAKE)));

    public static final Block BIGENDER_CANDLE_CAKE = registerBlock("bigender_candle_cake",
            new CandleCakeBlock(BIGENDER_CANDLE, FabricBlockSettings.copyOf(Blocks.CANDLE_CAKE)));

    public static final Block BISEXUAL_CANDLE_CAKE = registerBlock("bisexual_candle_cake",
            new CandleCakeBlock(BISEXUAL_CANDLE, FabricBlockSettings.copyOf(Blocks.CANDLE_CAKE)));

    public static final Block MLM_CANDLE_CAKE = registerBlock("mlm_candle_cake",
            new CandleCakeBlock(MLM_CANDLE, FabricBlockSettings.copyOf(Blocks.CANDLE_CAKE)));

    public static final Block ACE_CANDLE_CAKE = registerBlock("ace_candle_cake",
            new CandleCakeBlock(ACE_CANDLE, FabricBlockSettings.copyOf(Blocks.CANDLE_CAKE)));

    public static final Block ARO_CANDLE_CAKE = registerBlock("aro_candle_cake",
            new CandleCakeBlock(ARO_CANDLE, FabricBlockSettings.copyOf(Blocks.CANDLE_CAKE)));

    public static final Block APLATONIC_CANDLE_CAKE = registerBlock("aplatonic_candle_cake",
            new CandleCakeBlock(APLATONIC_CANDLE, FabricBlockSettings.copyOf(Blocks.CANDLE_CAKE)));

    public static final Block GENDER_FLUID_CANDLE_CAKE = registerBlock("gender_fluid_candle_cake",
            new CandleCakeBlock(GENDER_FLUID_CANDLE, FabricBlockSettings.copyOf(Blocks.CANDLE_CAKE)));

    public static final Block PAN_CANDLE_CAKE = registerBlock("pan_candle_cake",
            new CandleCakeBlock(PAN_CANDLE, FabricBlockSettings.copyOf(Blocks.CANDLE_CAKE)));

    public static final Block TRANS_CANDLE_CAKE = registerBlock("trans_candle_cake",
            new CandleCakeBlock(TRANS_CANDLE, FabricBlockSettings.copyOf(Blocks.CANDLE_CAKE)));

    public static final Block AROACE_CANDLE_CAKE = registerBlock("aroace_candle_cake",
            new CandleCakeBlock(AROACE_CANDLE, FabricBlockSettings.copyOf(Blocks.CANDLE_CAKE)));

    public static final Block LESBIAN_CANDLE_CAKE = registerBlock("lesbian_candle_cake",
            new CandleCakeBlock(LESBIAN_CANDLE, FabricBlockSettings.copyOf(Blocks.CANDLE_CAKE)));

    public static final Block PROGRESS_CANDLE_CAKE = registerBlock("progress_candle_cake",
            new CandleCakeBlock(PROGRESS_CANDLE, FabricBlockSettings.copyOf(Blocks.CANDLE_CAKE)));

    private static Block registerBlock(String name, Block block) {

        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(JoyMod.MOD_ID, name), block);

    }

    private static Item registerBlockItem(String name, Block block) {

        return Registry.register(Registries.ITEM, new Identifier(JoyMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));

    }

    public static void registerModBlocks() {
        // JoyMod.LOGGER.info("Adding gay blocks from" + JoyMod.MOD_ID);
    }
}

