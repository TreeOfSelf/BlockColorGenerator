package me.sebastian420;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.MapColor;
import net.minecraft.registry.Registries;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ColorDumper {
    private static class ColorData {
        int r, g, b;
        String colorName;

        public ColorData(int r, int g, int b, String colorName) {
            this.r = r;
            this.g = g;
            this.b = b;
            this.colorName = colorName;
        }
    }

    public static void dumpBlockColors(World world) {
        Map<String, ColorData> blockColors = new HashMap<>();
        BlockPos dummyPos = new BlockPos(0, 64, 0); // Dummy position for context

        for (Block block : Registries.BLOCK) {
            BlockState defaultState = block.getDefaultState();
            MapColor mapColor = defaultState.getMapColor(world, dummyPos);
            int mapColorInt = mapColor.color;

            String colorName = MapColorToString.get(mapColor);
            int r = (mapColorInt >> 16) & 0xFF;
            int g = (mapColorInt >> 8) & 0xFF;
            int b = mapColorInt & 0xFF;

            String blockId = Registries.BLOCK.getId(block).toString();

            blockColors.put(blockId, new ColorData(r, g, b, colorName));
        }

        try {
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();

            FileWriter writer = new FileWriter("block_colors.json");
            gson.toJson(blockColors, writer);
            writer.flush();
            writer.close();

            System.out.println("Successfully wrote block colors to block_colors.json");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
