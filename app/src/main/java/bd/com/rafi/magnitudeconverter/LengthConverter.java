package bd.com.rafi.magnitudeconverter;

import java.util.Arrays;

public class LengthConverter {
    String a;
    String b;
    Double value;
    int kilometer=0;
    int meter=1;
    int centimeter=2;
    int millimeter=3;
    int micrometer=4;
    int nanometer=5;
    int mile=6;
    int yard=7;
    int foot=8;
    int inch=9;
    String[] name={"kilometer","meter","centimeter","millimeter","micrometer","nanometer","mile","yard","foot","inch"};
    double[][] list={
            {1,1000,10000,100000,1000000,1000000,0.6213688756,1093.6132983,3280.839895,39370.07874},
            {0.001,1,100,1000,1000000,1000000000,0.0006213689,1.0936132983,3.280839895,39.37007874},
            {0.00001,0.01,1,10,10000,10000000,0.0000062137,0.010936133,0.032808399,0.3937007874},
            {0.000001,0.001,0.1,1,1000,1000000,6.213688756,0.0010936133,0.0032808399,0.0393700787},
            {9.999999999999,0.000001,0.0001,0.001,1,1000,6.2136887564676,0.0000010936,0.0000032808,0.0000393701},
            {1.999999999999,1.787888878,1.387837873,0.000001,0.001,1,6.21368875628392,1.0936132983232,3.34343434343,3.937007874},
            {1.60935,1609.35,160935,1609350,1609350000,1609350000,1,1760.0065617,5280.019685,63360.23622},
            {0.0009144,0.9144,91.44,914.4,914400,914400000,0.0005681797,1,3,36},
            {0.0003048,0.3048,30.48,304.8,304800,304800000,0.0001893932,0.3333333333,1,12},
            {0.0000254,0.0254,2.54,25.4,25400,25400000,0.0000157828,0.0277777778,0.0833333333,1}
    };


    public LengthConverter(){

    }

    public String getresult(String a,String b,String value){
        this.value=Double.parseDouble(value);
        this.a=a.toLowerCase();
        this.b=b.toLowerCase();
        double c;
        try {
             c=list[Arrays.asList(name).indexOf(a)][Arrays.asList(name).indexOf(b)]*this.value;
        } catch (Exception e) {
            return "inptut wrong syntex";
        }
        return String.valueOf(c);
    }
    public String getresult(String a,String b,Double value){
            this.value=value;
        this.a=a.toLowerCase();
        double c=list[0][1]*this.value;
        return String.valueOf(c);
    }


public String result(){
    if(a.toLowerCase().equals("kilo")){
          if(b.equals("kilometer")){
            return String.valueOf((value)*1 );
        }
        else if(b.equals("meter")){
            return String.valueOf((value)*1000);
        }

        else if(b.equals("centimeter")){
            return String.valueOf((value)*10000);
        }
        else if(b.equals("millimeter")){
            return String.valueOf((value)*100000);
        }
        else if(b.equals("micrometer")){
            return String.valueOf((value)*1000000);
        }
        else if(b.equals("nanometer")){
            return String.valueOf((value)*1000000);
        }
        else if(b.equals("mile")){
            return String.valueOf((value)*0.6213688756);
        }
        else if(b.equals("yard")){
            return String.valueOf((value)*1093.6132983);
        }
        else if(b.equals("foot")){
            return String.valueOf((value)*3280.839895);
        }
        else if(b.equals("inch")){
            return String.valueOf((value)*39370.07874);
        }
        else {
            return "wrong";
        }

    }
    else if(a.equals("meter")){
         if(b.equals("kilometer")){
            return String.valueOf((value)*0.001 );
        }
        else if(b.equals("meter")){
            return String.valueOf((value)*1);
        }

        else if(b.equals("centimeter")){
            return String.valueOf((value)*100);
        }
        else if(b.equals("millimeter")){
            return String.valueOf((value)*1000);
        }
        else if(b.equals("micrometer")){
            return String.valueOf((value)*1000000);
        }
        else if(b.equals("nanometer")){
            return String.valueOf((value)*1000000000);
        }

        else if(b.equals("mile")){
            return String.valueOf((value)*0.0006213689 );
        }
        else if(b.equals("yard")){
            return String.valueOf((value)*1.0936132983);
        }
        else if(b.equals("foot")){
            return String.valueOf((value)*3.280839895);
        }
        else if(b.equals("inch")){
            return String.valueOf((value)*39.37007874);
        }
    }
    else if(a.equals("centimeter ")){
        if(b.equals("kilometer")){
            return String.valueOf((value)*0.00001 );
        }
        if(b.equals("meter")){
            return String.valueOf((value)* 0.01 );
        }
        else if(b.equals("centimeter")){
            return String.valueOf((value)*1);
        }
        else if(b.equals("millimeter")){
            return String.valueOf((value)*1000);
        }
        else if(b.toLowerCase().equals("micrometer")){
            return String.valueOf((value)*1000000);
        }
        else if(b.toLowerCase().equals("nanometer")){
            return String.valueOf((value)*1000000000);
        }
        else if(b.toLowerCase().equals("mile")){
            return String.valueOf((value)*0.0006213689 );
        }
        else if(b.toLowerCase().equals("yard")){
            return String.valueOf((value)*1.0936132983);
        }
        else if(b.toLowerCase().equals("foot")){
            return String.valueOf((value)*3.280839895);
        }
        else if(b.toLowerCase().equals("inch")){
            return String.valueOf((value)*39.37007874);
        }
        else{
            return "wrong";
        }
    }
    else{
        return "wrong";
    }
return "akjd";
}










public String kilometerToMeter(){


        return String.valueOf((value)*1000);
}
public String MeterTokilometer(){
        return String.valueOf((value)/1000);
    }
    public String CentimeterTokilometer(){
        return String.valueOf((value)/1000);
    }

    public String MillimeterTokilometer(){
        return String.valueOf((value)/1000);
    }
    public String MicrometerTokilometer(){
        return String.valueOf((value)/1000);
    }
    public String NanometerTokilometer(){
        return String.valueOf((value)/1000);
    }
}
