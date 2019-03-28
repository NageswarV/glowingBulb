import java.util.*;
class MainClass {
    public static void main(String args[] ) throws Exception {
    Scanner scan =new Scanner(System.in);
    int test,key,result;
    test=Integer.parseInt(scan.nextLine());
    while(test-->0)
    {
        String str=scan.nextLine();
        GlowingBulb b=new GlowingBulb();
        key=Integer.parseInt(scan.nextLine());
         result=b.findBulb(key,str);
        System.out.println(result);
    }
}
}
class GlowingBulb {
    public static int findBulb(int key,String in){
    int i,count=0,result;
    ArrayList<Integer> index=new ArrayList<>();
        char input[]=in.toCharArray();
        for(i=0;i<input.length;i++)
        {
            if(Character.getNumericValue(input[i])==1){
            index.add(i+1);
            }
        }
        for(i=1,count=1;count<=key;i++)
        {
            for(int j=0;j<index.size();j++)
            {
               if(i%index.get(j)==0)
                    {count++;break;}
            }
        }
        index.clear();
        return i-1;
    }
}
