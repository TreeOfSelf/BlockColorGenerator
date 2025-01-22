package me.sebastian420;

import net.minecraft.block.MapColor;

public class MapColorToString {
    static String get(MapColor mapColor) {
        if (mapColor == null) {
            return "Unknown";
        }

        switch (mapColor.id) {
            case 0:
                return "Clear";
            case 1:
                return "Pale Green";
            case 2:
                return "Pale Yellow";
            case 3:
                return "White Gray";
            case 4:
                return "Bright Red";
            case 5:
                return "Pale Purple";
            case 6:
                return "Iron Gray";
            case 7:
                return "Dark Green";
            case 8:
                return "White";
            case 9:
                return "Light Blue Gray";
            case 10:
                return "Dirt Brown";
            case 11:
                return "Stone Gray";
            case 12:
                return "Water Blue";
            case 13:
                return "Oak Tan";
            case 14:
                return "Off White";
            case 15:
                return "Orange";
            case 16:
                return "Magenta";
            case 17:
                return "Light Blue";
            case 18:
                return "Yellow";
            case 19:
                return "Lime";
            case 20:
                return "Pink";
            case 21:
                return "Gray";
            case 22:
                return "Light Gray";
            case 23:
                return "Cyan";
            case 24:
                return "Purple";
            case 25:
                return "Blue";
            case 26:
                return "Brown";
            case 27:
                return "Green";
            case 28:
                return "Red";
            case 29:
                return "Black";
            case 30:
                return "Gold";
            case 31:
                return "Diamond Blue";
            case 32:
                return "Lapis Blue";
            case 33:
                return "Emerald Green";
            case 34:
                return "Spruce Brown";
            case 35:
                return "Dark Red";
            case 36:
                return "Terracotta White";
            case 37:
                return "Terracotta Orange";
            case 38:
                return "Terracotta Magenta";
            case 39:
                return "Terracotta Light Blue";
            case 40:
                return "Terracotta Yellow";
            case 41:
                return "Terracotta Lime";
            case 42:
                return "Terracotta Pink";
            case 43:
                return "Terracotta Gray";
            case 44:
                return "Terracotta Light Gray";
            case 45:
                return "Terracotta Cyan";
            case 46:
                return "Terracotta Purple";
            case 47:
                return "Terracotta Blue";
            case 48:
                return "Terracotta Brown";
            case 49:
                return "Terracotta Green";
            case 50:
                return "Terracotta Red";
            case 51:
                return "Terracotta Black";
            case 52:
                return "Dull Red";
            case 53:
                return "Dull Pink";
            case 54:
                return "Dark Crimson";
            case 55:
                return "Teal";
            case 56:
                return "Dark Aqua";
            case 57:
                return "Dark Dull Pink";
            case 58:
                return "Bright Teal";
            case 59:
                return "Deepslate Gray";
            case 60:
                return "Raw Iron Pink";
            case 61:
                return "Lichen Green";
            default:
                return "Unknown";
        }
    }
}