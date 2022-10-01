package com.bus.custom;

public class ConsoleColors {
	    public static final String RESET = "\033[0m"; // Text Reset

	    public static final String ERASE = "\033[H\033[2J";

	    public static final String HIDDEN = "\033[8;30m";

	    // Creates a black box around the word
	    public static final String BOXING = "\033[0;51m"; // BLAK

	    // This will create a black background and make the text previous color
	    // Unless color black, then it will make it white
	    public static final String TEXT_BACKGROUND = "\033[0;7m"; // BLACK

	    // Regular Colors
	    public static final String BLACK = "\033[0;30m"; // BLACK
	    public static final String RED = "\033[0;31m"; // RED
	    public static final String GREEN = "\033[0;32m"; // GREEN
	    public static final String YELLOW = "\033[0;33m"; // YELLOW
	    public static final String BLUE = "\033[0;34m"; // BLUE
	    public static final String PURPLE = "\033[0;35m"; // PURPLE
	    public static final String CYAN = "\033[0;36m"; // CYAN
	    public static final String WHITE = "\033[0;37m"; // WHITE
	    public static final String LIGHT_PURPLE = "\033[38;2;200;0;200m"; // LIGHT PURPLE
	    public static final String TEAL = "\033[38;2;0;225;221m"; // TEAL
	    public static final String ORANGE = "\033[38;2;225;153;0m"; // ORANGE
	    public static final String LIGHT_GREEN = "\033[38;2;136;255;0m"; // LIGHT GREEN
	    public static final String LIGHT_BLUE = "\033[38;2;120;172;255m"; // LIGHT BLUE
	    public static final String DARK_BLUE = "\033[38;2;72;0;255m"; // DARK BLUE
	    public static final String ROSY_PINK = "\033[38;2;255;0;162m"; // ROSY PINK
	    public static final String BROWN = "\033[38;2;135;82;62m"; // BROWN
	    public static final String FOREST_GREEN = "\033[38;2;62;135;81m"; // FOREST GREEN
	    public static final String BANANA_YELLOW = "\033[38;2;240;238;113m"; // BANANA YELLOW
	    public static final String DARK_RED = "\033[38;2;145;40;16m"; // DARK RED
	    public static final String LIGHT_PINK = "\033[38;2;255;153;240m"; // LIGHT PINK

	    // StrikeOut
	    public static final String BLACK_STRIKE = "\033[9;30m"; // BLACK
	    public static final String RED_STRIKE = "\033[9;31m"; // RED
	    public static final String GREEN_STRIKE = "\033[9;32m"; // GREEN
	    public static final String YELLOW_STRIKE = "\033[9;33m"; // YELLOW
	    public static final String BLUE_STRIKE = "\033[9;34m"; // BLUE
	    public static final String PURPLE_STRIKE = "\033[9;35m"; // PURPLE
	    public static final String CYAN_STRIKE = "\033[9;36m"; // CYAN
	    public static final String WHITE_STRIKE = "\033[9;37m"; // WHITE

	    // Italic
	    public static final String BLACK_ITALIC = "\033[3;30m"; // BLACK
	    public static final String RED_ITALIC = "\033[3;31m"; // RED
	    public static final String GREEN_ITALIC = "\033[3;32m"; // GREEN
	    public static final String YELLOW_ITALIC = "\033[3;33m"; // YELLOW
	    public static final String BLUE_ITALIC = "\033[3;34m"; // BLUE
	    public static final String PURPLE_ITALIC = "\033[3;35m"; // PURPLE
	    public static final String CYAN_ITALIC = "\033[3;36m"; // CYAN
	    public static final String WHITE_ITALIC = "\033[3;37m"; // WHITE

	    // Bold
	    public static final String BLACK_BOLD = "\033[1;30m"; // BLACK
	    public static final String RED_BOLD = "\033[1;31m"; // RED
	    public static final String GREEN_BOLD = "\033[1;32m"; // GREEN
	    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
	    public static final String BLUE_BOLD = "\033[1;34m"; // BLUE
	    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
	    public static final String CYAN_BOLD = "\033[1;36m"; // CYAN
	    public static final String WHITE_BOLD = "\033[1;37m"; // WHITE

	    // Underline
	    public static final String BLACK_UNDERLINED = "\033[4;30m"; // BLACK
	    public static final String RED_UNDERLINED = "\033[4;31m"; // RED
	    public static final String GREEN_UNDERLINED = "\033[4;32m"; // GREEN
	    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
	    public static final String BLUE_UNDERLINED = "\033[4;34m"; // BLUE
	    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
	    public static final String CYAN_UNDERLINED = "\033[4;36m"; // CYAN
	    public static final String WHITE_UNDERLINED = "\033[4;37m"; // WHITE

	    // Background
	    public static final String BLACK_BACKGROUND = "\033[40m"; // BLACK
	    public static final String RED_BACKGROUND = "\033[41m"; // RED
	    public static final String GREEN_BACKGROUND = "\033[42m"; // GREEN
	    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
	    public static final String BLUE_BACKGROUND = "\033[44m"; // BLUE
	    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
	    public static final String CYAN_BACKGROUND = "\033[46m"; // CYAN
	    public static final String WHITE_BACKGROUND = "\033[47m"; // WHITE
	    public static final String LIGHT_PURPLE_BACKGROUND = "\033[48;2;200;0;200m"; // LIGHT PURPLE
	    public static final String TEAL_BACKGROUND = "\033[48;2;0;225;221m"; // TEAL
	    public static final String ORANGE_BACKGROUND = "\033[48;2;225;153;0m"; // ORANGE
	    public static final String LIGHT_GREEN_BACKGROUND = "\033[48;2;136;255;0m"; // LIGHT GREEN
	    public static final String LIGHT_BLUE_BACKGROUND = "\033[48;2;120;172;255m"; // LIGHT BLUE
	    public static final String DARK_BLUE_BACKGROUND = "\033[48;2;72;0;255m"; // DARK BLUE
	    public static final String ROSY_PINK_BACKGROUND = "\033[48;2;255;0;162m"; // ROSY PINK
	    public static final String BROWN_BACKGROUND = "\033[48;2;135;82;62m"; // BROWN
	    public static final String FOREST_GREEN_BACKGROUND = "\033[48;2;62;135;81m"; // FOREST GREEN
	    public static final String BANANA_YELLOW_BACKGROUND = "\033[48;2;240;238;113m"; // BANANA YELLOW
	    public static final String DARK_RED_BACKGROUND = "\033[48;2;145;40;16m"; // DARK RED
	    public static final String LIGHT_PINK_BACKGROUND = "\033[48;2;255;153;240m"; // LIGHT PINK

	    // High Intensity
	    public static final String BLACK_BRIGHT = "\033[0;90m"; // BLACK
	    public static final String RED_BRIGHT = "\033[0;91m"; // RED
	    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
	    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
	    public static final String BLUE_BRIGHT = "\033[0;94m"; // BLUE
	    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
	    public static final String CYAN_BRIGHT = "\033[0;96m"; // CYAN
	    public static final String WHITE_BRIGHT = "\033[0;97m"; // WHITE

	    // Bold High Intensity
	    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
	    public static final String RED_BOLD_BRIGHT = "\033[1;91m"; // RED
	    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
	    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
	    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m"; // BLUE
	    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
	    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m"; // CYAN
	    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

	    // High Intensity backgrounds
	    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
	    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
	    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
	    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
	    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
	    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
	    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m"; // CYAN
	    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m"; // WHITE
}
