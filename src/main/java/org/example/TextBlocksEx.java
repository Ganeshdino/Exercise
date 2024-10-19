package org.example;

public class TextBlocksEx {

    static String message = """
    'The time has come,' the Walrus said,
    'To talk of many things:
    Of shoes -- and ships -- and sealing-wax --
    Of cabbages -- and kings --
    And why the sea is boiling hot --
    And whether pigs have wings.'
    """;

    public static void main(String[] args) {
        System.out.println(message);

        String source = """
    String message = "Hello, World!";
    System.out.println(message);
    """;
        System.out.printf("%s%n", source);

        /*
         * final newline
         */
        String name = """
    red
    green
    blue""";
        System.out.println(name);
        /*
         * Incidental White Space
         */
        String html = """
        <html>
            <body>
                <p>Hello World.</p>
            </body>
        </html>
        """;
        System.out.println(html);
    }


}
