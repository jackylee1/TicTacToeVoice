package me.ktar.tictactoe.server.tictac.board;
/*
 * Copyright (C) 2013-Current Carter Gale (Ktar5) <buildfresh@gmail.com>
 * 
 * This file is part of Auto-PiServer.
 * 
 * Auto-PiServer can not be copied and/or distributed without the express
 * permission of the aforementioned owner.
 */

public enum BoardPart {

    X(new String[]{
            "                           ",
            "                           ",
            "     xXx           xXx     ",
            "      xXx         xXx      ",
            "       xXx       xXx       ",
            "        xXx     xXx        ",
            "         xXx   xXx         ",
            "          xXx xXx          ",
            "           xXxXx           ",
            "          xXx xXx          ",
            "         xXx   xXx         ",
            "        xXx     xXx        ",
            "       xXx       xXx       ",
            "      xXx         xXx      ",
            "     xXx           xXx     ",
            "                           ",
            "                           "
    }),
    O(new String[]{
            "                           ",
            "                           ",
            "          oOOOOOo          ",
            "       oOOo     oOOo       ",
            "      oO           Oo      ",
            "     oO             Oo     ",
            "     O               O     ",
            "     O               O     ",
            "     O               O     ",
            "     O               O     ",
            "     O               O     ",
            "     oO             Oo     ",
            "      oO           Oo      ",
            "       oOOo     oOOo       ",
            "          oOOOOOo          ",
            "                           ",
            "                           "
    }),
    NO(new String[]{
            "                           ",
            "                           ",
            "                           ",
            "                           ",
            "                           ",
            "                           ",
            "                           ",
            "                           ",
            "                           ",
            "                           ",
            "                           ",
            "                           ",
            "                           ",
            "                           ",
            "                           ",
            "                           ",
            "                           "
    }),
    DOWN(new String[]{
            "######",
            "######",
            "######",
            "######",
            "######",
            "######",
            "######",
            "######",
            "######",
            "######",
            "######",
            "######",
            "######",
            "######",
            "######",
            "######",
            "######"
    }),
    ARM(new String[]{
            "#############################################################################################################",
            "#############################################################################################################",
            "#############################################################################################################"
    }),
    LOW_LEFT(new String[]{
            "                           ",
            "    Ll      OOO   W   W    ",
            "    Ll     O   O  W | W    ",
            "    Ll     O   O  W | W    ",
            "    Ll     O   O  ^W^W^    ",
            "    LLLLL   OOO    W W     ",
            "                           ",
            "  L     Eeeee FFFFF TTTTT  ",
            "  L     E     F       T    ",
            "  L     Eeee  FFFF    T    ",
            "  L     E     F       T    ",
            "  LLLLL Eeeee F       T    ",
            "                           ",
            "                           ",
            "                           ",
            "                           ",
            "                           "
    }),
    LOW_MID(new String[]{
            "                           ",
            "    Ll      OOO   W   W    ",
            "    Ll     O   O  W | W    ",
            "    Ll     O   O  W | W    ",
            "    Ll     O   O  ^W^W^    ",
            "    LLLLL   OOO    W W     ",
            "                           ",
            "    M   M  IIIII  DDDD     ",
            "    MM MM    I    D   D    ",
            "    M M M    I    D   D    ",
            "    M   M    I    D   D    ",
            "    M   M  IIIII  DDDD     ",
            "                           ",
            "                           ",
            "                           ",
            "                           ",
            "                           "
    }),
    LOW_RIGHT(new String[]{
            "                           ",
            "    Ll      OOO   W   W    ",
            "    Ll     O   O  W | W    ",
            "    Ll     O   O  W | W    ",
            "    Ll     O   O  ^W^W^    ",
            "    LLLLL   OOO    W W     ",
            "                           ",
            "  RRRR  IIIII TTTTT EEEEE  ",
            "  R   R   I     T   E      ",
            "  RRRR    I     T   EEEE   ",
            "  R   R   I     T   E      ",
            "  R   R IIIII   T   EEEEE  ",
            "                           ",
            "                           ",
            "                           ",
            "                           ",
            "                           "
    }),
    MID_LEFT(new String[]{
            "                           ",
            "                           ",
            "                           ",
            "    M   M  IIIII  DDDD     ",
            "    MM MM    I    D   D    ",
            "    M M M    I    D   D    ",
            "    M   M    I    D   D    ",
            "    M   M  IIIII  DDDD     ",
            "                           ",
            "  L     Eeeee FFFFF TTTTT  ",
            "  L     E     F       T    ",
            "  L     Eeee  FFFF    T    ",
            "  L     E     F       T    ",
            "  LLLLL Eeeee F       T    ",
            "                           ",
            "                           ",
            "                           "
    }),
    MID_MID(new String[]{
            "                           ",
            "                           ",
            "                           ",
            "    M   M  IIIII  DDDD     ",
            "    MM MM    I    D   D    ",
            "    M M M    I    D   D    ",
            "    M   M    I    D   D    ",
            "    M   M  IIIII  DDDD     ",
            "                           ",
            "    M   M  IIIII  DDDD     ",
            "    MM MM    I    D   D    ",
            "    M M M    I    D   D    ",
            "    M   M    I    D   D    ",
            "    M   M  IIIII  DDDD     ",
            "                           ",
            "                           ",
            "                           "
    }),
    MID_RIGHT(new String[]{
            "                           ",
            "                           ",
            "                           ",
            "    M   M  IIIII  DDDD     ",
            "    MM MM    I    D   D    ",
            "    M M M    I    D   D    ",
            "    M   M    I    D   D    ",
            "    M   M  IIIII  DDDD     ",
            "                           ",
            "  RRRR  IIIII TTTTT EEEEE  ",
            "  R   R   I     T   E      ",
            "  RRRR    I     T   EEEE   ",
            "  R   R   I     T   E      ",
            "  R   R IIIII   T   EEEEE  ",
            "                           ",
            "                           ",
            "                           "
    }),
    TOP_LEFT(new String[]{
            "                           ",
            "                           ",
            "                           ",
            "                           ",
            "                           ",
            "    TTTTT   OOO   PPPP     ",
            "      T    O   O  P   P    ",
            "      T    O   O  PPPP     ",
            "      T    O   O  P        ",
            "      T     OOO   P        ",
            "                           ",
            "  L     Eeeee FFFFF TTTTT  ",
            "  L     E     F       T    ",
            "  L     Eeee  FFFF    T    ",
            "  L     E     F       T    ",
            "  LLLLL Eeeee F       T    ",
            "                           "
    }),
    TOP_MID(new String[]{
            "                           ",
            "                           ",
            "                           ",
            "                           ",
            "                           ",
            "    TTTTT   OOO   PPPP     ",
            "      T    O   O  P   P    ",
            "      T    O   O  PPPP     ",
            "      T    O   O  P        ",
            "      T     OOO   P        ",
            "                           ",
            "    M   M  IIIII  DDDD     ",
            "    MM MM    I    D   D    ",
            "    M M M    I    D   D    ",
            "    M   M    I    D   D    ",
            "    M   M  IIIII  DDDD     ",
            "                           "
    }),
    TOP_RIGHT(new String[]{
            "                           ",
            "                           ",
            "                           ",
            "                           ",
            "                           ",
            "    TTTTT   OOO   PPPP     ",
            "      T    O   O  P   P    ",
            "      T    O   O  PPPP     ",
            "      T    O   O  P        ",
            "      T     OOO   P        ",
            "                           ",
            "  RRRR  IIIII TTTTT EEEEE  ",
            "  R   R   I     T   E      ",
            "  RRRR    I     T   EEEE   ",
            "  R   R   I     T   E      ",
            "  R   R IIIII   T   EEEEE  ",
            "                           "
    }),;

    public String[] value;

    private BoardPart(String[] parts) {
        this.value = parts;
    }

}
