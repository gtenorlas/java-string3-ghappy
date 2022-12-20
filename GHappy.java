class GHappy {

    public static boolean gHappy(String str) {
        String newStr = str.trim().toLowerCase();
        int strLen = newStr.length();
        boolean isHappy = false;
        int gCounterStreak = 0;
        for (int x = 0; x < strLen; x++) {
            if (newStr.charAt(x) == 'g') {
                gCounterStreak++;
                if (gCounterStreak == 2) {
                    isHappy = true;
                }

            } else {
                if (gCounterStreak == 1) {
                    isHappy = false;
                }
                gCounterStreak = 0;
            }
        }
        if (gCounterStreak == 1) {
            isHappy = false;
        }
        if (newStr.indexOf('g') == -1) {
            isHappy = true;
        }
        return isHappy;
    }

    public static void main(String[] args) {
        System.out.println(gHappy("xxggxx"));
    }
}
