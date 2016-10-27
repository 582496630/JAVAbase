package test1;

public class StringDemo {

	public static void main(String[] args) {
        char[] Hello1 ={'n','i','h','a','o'};
        String Hello2=new String(Hello1);
        System.out.println(Hello2);
        
        char[] hello ={'y','i','q','i','c','h','i','f','a','n'};
        String nihao =new String(hello);
        System.out.println(nihao);
        
        String ni="晚上吃什么";
        System.out.println(ni+"\n"+"不知道");
        
        String wo="牛肉面几个字?";
        int many=wo.length();
        System.out.println(" 牛肉面几个字?"+"\t"+many);
	}

}
