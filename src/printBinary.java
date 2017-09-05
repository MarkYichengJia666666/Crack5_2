/**
 * Created by jiayicheng on 17/8/14.
 */
public class printBinary {
    public String printBinary(double num)
    {
        if(num>=1||num<=0)
            return "error";
        StringBuilder binary=new StringBuilder();
        binary.append("0.");
        while(num>0)
        {
            if(binary.length()>32)
                return "error";
            double r=num*2;
            if(r>=1) {
                binary.append('1');
                num=r-1;
            }
            else
                {
                binary.append('0');
                    num=r;
            }
        }
        return binary.toString();
    }

    public String print(double num)
    {
        if(num>=1||num<=0)
            return "error";
        StringBuilder binary=new StringBuilder();
        binary.append("0.");
        double temp=0.5;
        while(num>0)
        { if(binary.length()>32)
            return "error";
            if(num>temp) {
                binary.append('1');
            num=num-temp;
            }   else{
                binary.append('0');
            }
            temp/=2;

        }
        return binary.toString();
    }
}
