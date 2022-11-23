class Solution {
    public String solution(String new_id) {
       String answer = "";

        System.out.println("1단계 시작");
        String new_id_1 = new_id.toLowerCase();
        System.out.println(new_id_1);

        System.out.println("2단계 시작");
        String new_id_2 = new_id_1.replaceAll("[^a-z0-9_.-]", "");
        System.out.println(new_id_2);

        System.out.println("3단계 시작");
        String new_id_3 = new_id_2.replaceAll("[.]+", ".");
        System.out.println(new_id_3);


        System.out.println("4단계 시작");
        String new_id_4 = new_id_3;
        if (new_id_4.endsWith(".")) {
            new_id_4 = new_id_4.substring(0, new_id_4.length() - 1);
        }
        if (new_id_4.startsWith(".")) {
            new_id_4 = new_id_4.substring(1);
        }        System.out.println(new_id_4);

        System.out.println("5단계 시작");
        String new_id_5 = new_id_4;
        if (new_id_5.length() < 1) {
            new_id_5 += "a";
        }System.out.println(new_id_5);

        System.out.println("6단계 시작");
        String new_id_6 = new_id_5;
        if (new_id_5.length() >= 16) {
            new_id_6 = new_id_5.substring(0, 15);
        }
        if (new_id_6.endsWith(".")) {
            new_id_6 = new_id_6.substring(0, new_id_6.length() - 1);
        } answer = new_id_6;

        System.out.println("7단계 시작");
        String new_id_7 = new_id_6;
        if (new_id_7.length() <= 2) {
            char last = new_id_7.charAt(new_id_7.length() - 1);
            while (new_id_7.length() < 3) {
                new_id_7 += last;
            }
        }return new_id_7;
    }
}