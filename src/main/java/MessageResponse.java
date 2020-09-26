import java.util.HashMap;

public class MessageResponse {

    HashMap<String, String> Macro = new HashMap<String, String>();

    public MessageResponse() {
        Macro.put("++imageofcode","An image of your code is not helpful. Helpers need the text of the code and images are not an acceptable substitute. (source: http://idownvotedbecau.se/imageofcode)\n" +
                "Please share your code as text! If it's short, wrap it directly in Discord. If it's long, use a third-party service (e.g. Hastebin). If you don't know how to wrap code, type ++wrapmini.\n");
        Macro.put("++wrapmini","Surround code with:\n" +
                "\\`\\`\\`language\n" +
                "foo = 42\n" +
                "\\`\\`\\`\n" +
                "\n" +
                "This outputs:\n" +
                "```\n" +
                "foo = 42\n" +
                "```\n" +
                "Replace \"language\" in the example with java, cpp, python, etc. There should no space/line between the language and the first backtick (`), not to be confused with a single quote (').");
        Macro.put("++wrapcode","Please wrap your code, examples\n" +
                "Do\n" +
                "\\`\\`\\`python\n" +
                "print('~/python/one-liners.py'.split('.')[-1])\n" +
                "\\`\\`\\`\n" +
                "To get:\n" +
                "```python\n" +
                "print('~/python/one-liners.py'.split('.')[-1])\n" +
                "```\n" +
                "Or:\n" +
                "```html\n" +
                "<ul style=\"list-style:none;\"><li>Cappucino</li></ul>\n" +
                "```\n" +
                "To get\n" +
                "```html\n" +
                "<ul style=\"list-style:none;\"><li>Cappucino</li></ul>\n" +
                "```\n" +
                "Don't confuse a backtick (`) with a single quote (')!\n" +
                "http://highlightjs.readthedocs.io/en/latest/css-classes-reference.html#language-names-and-aliases");
        Macro.put("++xyproblem","http://xyproblem.info/");
        Macro.put("++askbetterfirst","If a user is asking a question poorly it is much more important that they learn how to ask questions properly first before we answer them. Give a man a fish, he'll be fed for a few days, teach a man to fish and he will be fed for life.");
        Macro.put("++ask","Please just ask your question. Don't ask to ask. Don't ask for topic experts or DMs. Don't ping random users. Skip the formalities and ask away! https://dontasktoask.com/");
        Macro.put("++noresearch","Research is an important first step in solving problems. Because of the vast amount of information on the internet, it often takes just a simple search or two to find them. (source: https://idownvotedbecau.se/noresearch)\n" +
                "Haven't done any research yet? Start researching and keep track of what was searched for, what was found, and why it didn't help. Still couldn't find an answer? Ask your question and include your findings!");
        Macro.put("++bin","https://hastebin.com/\n" +
                "https://hasteb.in/\n" +
                "https://hatebin.com/");
        Macro.put("++patience","Whilst your enthusiasm is greatly appreciated, please be patient whilst waiting for someone to respond to your question. Don't pester those in other channels for help.");
    }

}
