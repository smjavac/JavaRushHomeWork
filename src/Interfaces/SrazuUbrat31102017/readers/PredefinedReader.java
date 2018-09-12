package Interfaces.SrazuUbrat31102017.readers;

import Interfaces.SrazuUbrat31102017.readers.IReader;

public class PredefinedReader implements IReader
{
   private final String str;

   public PredefinedReader(final String str){
       this.str = str;
   }

    @Override
    public String read()
    {
        return str;
    }
}
