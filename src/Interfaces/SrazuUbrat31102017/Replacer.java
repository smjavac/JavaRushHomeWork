package Interfaces.SrazuUbrat31102017;

import Interfaces.SrazuUbrat31102017.printer.AdvConsolePrinter;
import Interfaces.SrazuUbrat31102017.printer.ConsolPrinter;
import Interfaces.SrazuUbrat31102017.printer.IPrinter;
import Interfaces.SrazuUbrat31102017.readers.IReader;
import Interfaces.SrazuUbrat31102017.readers.PredefinedReader;

public class Replacer
{
    private final IReader reader;
    private final IPrinter printer;

    public Replacer(final IReader reader, final IPrinter printer)
    {
        this.reader = reader;
        this.printer = printer;
    }
    public void replacer(){
        final String text = reader.read();
        final  String replacedText = text.replace(":)", "=)");
        printer.print(replacedText);
    }

    public static void main(String[] args)
    {
        final IReader reader = new PredefinedReader("sdfsdfsdf:) hjhuikh:))) sdfsdffs:)");
        final IPrinter printer = new ConsolPrinter();
        final IPrinter advPrinter = new AdvConsolePrinter();
        final Replacer replacer = new Replacer(reader, printer);
        final Replacer advreplacer = new Replacer(reader, advPrinter);  // создается еще один принтер, который никак не зависит от ридера
        replacer.replacer();
        advreplacer.replacer();
    }
}
