package commands

/**
 * Created by egor on 25.06.16.
 */
import org.crsh.cli.Command
import org.crsh.cli.Usage
import org.crsh.command.InvocationContext

class perdak {

    @Usage("Say Hello")
    @Command
    def main(InvocationContext context) {
        return "Hello qq"
    }

}

