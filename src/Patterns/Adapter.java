package Patterns;

public class Adapter
{
    interface AlphaList
    {
        void add(int value);
        void insert(int index, int value);
        int get(int index);
        void set(int index, int value);
        int count();
        void remove(int index);
    }

    static class AlphaListManager
    {
        public static AlphaList createList()
        {
           return null; //какой-то код по созданию объекта
        }
    }

    interface BetaList
    {
        int getValue(int index);
        void setValue(int index, int value);
        int getSize();
        void setSize(int newSize);
    }
    static class BetaSaveManager
    {
        public static void saveList(BetaList list)
        {
            //какой-то код по сохранению объекта
            //типа BetaList в файл на диске
        }
    }

    static class ListAdapter implements BetaList
    {
        private AlphaList list;
        ListAdapter(AlphaList list)
        {
            this.list = list;
        }

        public int getValue(int index)
        {
            return this.list.get(index);
        }

        public void setValue(int index, int value)
        {
            this.list.set(index, value);
        }

        public int getSize()
        {
            return this.list.count();
        }

        public void setSize(int newSize)
        {
            if (newSize > this.list.count())
            {
                while (this.list.count() < newSize)
                {
                    this.list.add(Integer.parseInt(null));
                }
            }
 else if (newSize < this.list.count()) {
            while (this.list.count() > newSize)
            {
                list.remove(list.count() - 1);
            }
        }
        }
    }

    public static void main(String[] args)
    {
        AlphaList listAlpha = AlphaListManager.createList();
        BetaList listBeta = new ListAdapter(listAlpha);
        BetaSaveManager.saveList(listBeta);
    }
}
