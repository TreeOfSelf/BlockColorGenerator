package me.sebastian420;

import net.minecraft.block.MapColor;

public class MapColorToString {
    static String get(MapColor mapColor) {

        if (mapColor == null) {
            return "CLEAR";
        }

        return switch (mapColor.id) {
            case 1 -> "PALE_GREEN";
            case 2 -> "PALE_YELLOW";
            case 3 -> "WHITE_GRAY";
            case 4 -> "BRIGHT_RED";
            case 5 -> "PALE_PURPLE";
            case 6 -> "IRON_GRAY";
            case 7 -> "DARK_GREEN";
            case 8 -> "WHITE";
            case 9 -> "LIGHT_BLUE_GRAY";
            case 10 -> "DIRT_BROWN";
            case 11 -> "STONE_GRAY";
            case 12 -> "WATER_BLUE";
            case 13 -> "OAK_TAN";
            case 14 -> "OFF_WHITE";
            case 15 -> "ORANGE";
            case 16 -> "MAGENTA";
            case 17 -> "LIGHT_BLUE";
            case 18 -> "YELLOW";
            case 19 -> "LIME";
            case 20 -> "PINK";
            case 21 -> "GRAY";
            case 22 -> "LIGHT_GRAY";
            case 23 -> "CYAN";
            case 24 -> "PURPLE";
            case 25 -> "BLUE";
            case 26 -> "BROWN";
            case 27 -> "GREEN";
            case 28 -> "RED";
            case 29 -> "BLACK";
            case 30 -> "GOLD";
            case 31 -> "DIAMOND_BLUE";
            case 32 -> "LAPIS_BLUE";
            case 33 -> "EMERALD_GREEN";
            case 34 -> "SPRUCE_BROWN";
            case 35 -> "DARK_RED";
            case 36 -> "TERRACOTTA_WHITE";
            case 37 -> "TERRACOTTA_ORANGE";
            case 38 -> "TERRACOTTA_MAGENTA";
            case 39 -> "TERRACOTTA_LIGHT_BLUE";
            case 40 -> "TERRACOTTA_YELLOW";
            case 41 -> "TERRACOTTA_LIME";
            case 42 -> "TERRACOTTA_PINK";
            case 43 -> "TERRACOTTA_GRAY";
            case 44 -> "TERRACOTTA_LIGHT_GRAY";
            case 45 -> "TERRACOTTA_CYAN";
            case 46 -> "TERRACOTTA_PURPLE";
            case 47 -> "TERRACOTTA_BLUE";
            case 48 -> "TERRACOTTA_BROWN";
            case 49 -> "TERRACOTTA_GREEN";
            case 50 -> "TERRACOTTA_RED";
            case 51 -> "TERRACOTTA_BLACK";
            case 52 -> "DULL_RED";
            case 53 -> "DULL_PINK";
            case 54 -> "DARK_CRIMSON";
            case 55 -> "TEAL";
            case 56 -> "DARK_AQUA";
            case 57 -> "DARK_DULL_PINK";
            case 58 -> "BRIGHT_TEAL";
            case 59 -> "DEEPSLATE_GRAY";
            case 60 -> "RAW_IRON_PINK";
            case 61 -> "LICHEN_GREEN";
            default -> "CLEAR";
        };
    }
}