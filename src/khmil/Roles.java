package khmil;

public class Roles {
    String[] roles;
    String[] textLines;

    public Roles(String[] roles, String[] textLines) {
        this.roles = roles;
        this.textLines = textLines;
    }

    private String printTextPerRole(String[] roles, String[] textLines) {
        String result = "";
        for (int j = 0; j < roles.length; j++) {
            String curr = roles[j];
            int size = curr.length();
            if (j > 0 && j < roles.length) {
                System.out.println("\n");
                result.concat("\n");
            }
            System.out.println(roles[j] + ":");
            result.concat(roles[j] + ":");
            for (int i = 0; i < textLines.length; i++) {
                char t = textLines[i].charAt(size);
                if (textLines[i].substring(0, size).equals(roles[j])) {
                    System.out.println(i + 1 + ")" + textLines[i].substring(size + 1));
                    result.concat(i + 1 + ")" + textLines[i].substring(size + 1));
                }
            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        String[] roles = {
                "Городничий", "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};

        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
        };
        Roles role = new Roles(roles, textLines);
        role.printTextPerRole(roles, textLines);
    }
}
