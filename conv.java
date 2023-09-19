import java.util.*;

public class conv {

    public int[] convolution (int[] x, int[] h) {

        int xlen = x.length;
        int hlen = h.length;

        int[] xnew = new int [xlen + (2*hlen) - 2];

        for (int i=0; i<=xlen-1; i++){
            xnew[hlen-1+i] = x[i];}

        int xin = 0;
        int out = 0;
        int iter = 0;
        ArrayList<Integer> outlist = new ArrayList<Integer>();

        int[] hnew = new int[hlen];

        for (int i=0; i<hlen; i++){
            hnew[i] = h[hlen-1-i];}

        while (xin <= xnew.length - hlen){
            out = 0;
                for (int j=xin; j<xin+hlen; j++){
                    out = out + xnew[j]*hnew[j-iter];}

            iter = iter+1;
            outlist.add(out);
            xin = xin+1;}

        int[] outarr = new int[outlist.size()];
        for (int i = 0; i < outlist.size(); i++) {
            outarr[i] = outlist.get(i);}

        return outarr;}

    public static void main(String[] args) {

        // Change inputs here
        int[] x = {1,2,3,4};
        int[] h = {-1,1};

        conv CONV = new conv();
        int[] out = CONV.convolution(x, h);
        System.out.println(Arrays.toString(out));
    }}