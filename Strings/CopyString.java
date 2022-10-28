class CopyString
{

static void strCopy(char string1[], char string2[])
{
    int i = 0;
    for (i = 0; i < string1.length; i++)
         string2[i] = string1[i];
}
 
public static void main(String[] args)
{
    char string1[] = "testing".toCharArray();
    char string2[] = new char[string1.length];
    strCopy(string1, string2);
    System.out.println(String.valueOf(string2));
}
}
