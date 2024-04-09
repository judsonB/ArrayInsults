public class Insulter
{
    public static void main(String[] args)
    {
        String randWord1 = get1stWord();
        String randWord2 = get2ndWord();
        String randWord3 = get3rdWord();
        System.out.println("Thou "+randWord1+" "+randWord2+" "+randWord3+"!");
        /*
        //The following brute-forces the first 1000 combinations.
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                for(int k = 0; k < 10; k++)
                {
                    String randWord1 = get1stWord(i);
                    String randWord2 = get2ndWord(j);
                    String randWord3 = get3rdWord(k);
                    System.out.println((i*100+j*10+k)+" - Thou "+randWord1+" "+randWord2+" "+randWord3+"!");
                }
            }
        }
        */
    }
    public static int random_range(int min, int max)
    {
        int size = max - min + 1;
        return (int)(Math.random() * size)+min;
    }
    public static String get1stWord()
    {
        int min = 0;
        int max = 10;
        int rand = random_range(min, max);
        return get1stWord(rand);
    }
    public static String get1stWord(int rand)
    {
        switch(rand)
        {
            case 0: return "artless";
            case 1: return "bawdy";
            case 2: return "beslubbering";
            case 3: return "bootless";
            case 4: return "churlish";
            case 5: return "cockered";
            case 6: return "clouted";
            case 7: return "craven";
            case 8: return "currish";
            case 9: return "dankish";
            case 10: return "dissembling";
            default: return "Error!";
        }
    }
    public static String get2ndWord()
    {
        int min = 0;
        int max = 10;
        int rand = random_range(min, max);
        return get2ndWord(rand);
    }
    public static String get2ndWord(int rand)
    {
        switch(rand)
        {
            case 0: return "base-court";
            case 1: return "bat-forling";
            case 2: return "beef-witted";
            case 3: return "beetle-headed";
            case 4: return "boil-brained";
            case 5: return "clapper-clawed";
            case 6: return "clay-brained";
            case 7: return "common-kissing";
            case 8: return "crook-pated";
            case 9: return "dismal-dreaming";
            case 10: return "dizzy-eyed";
            default: return "Error!";
        }
    }
    public static String get3rdWord()
    {
        int min = 0;
        int max = 10;
        int rand = random_range(min, max);
        return get3rdWord(rand);
    }
    public static String get3rdWord(int rand)
    {
        switch(rand)
        {
            case 0: return "apple-john";
            case 1: return "baggage";
            case 2: return "barnacle";
            case 3: return "bladder";
            case 4: return "boar-pig";
            case 5: return "bugbear";
            case 6: return "bum-bailey";
            case 7: return "canket-blossom";
            case 8: return "clack-dish";
            case 9: return "clotpole";
            case 10: return "coxcomb";
            default: return "Error!";
        }
    }
}
