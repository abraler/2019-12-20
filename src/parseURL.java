public class parseURL {

    public static void main(String[] args) {
        String url="https:" +
                "//www.baidu.com/" +
                "s?ie=utf-8&f=8&rsv_bp=1&rsv_idx=1&tn=baidu&wd=c%2B%2B&rsv_pq=a4fc69f200076536&rsv_t=2b96NbhzR2Ir%2BdW1z0tx0yYZJG0xZgadx7dwH0Qkvn6IH793SOANRIZNaj0&rqlang=cn&rsv_enter=1&rsv_dl=tb&rsv_sug3=3&rsv_sug1=3&rsv_sug7=100&rsv_sug2=0&prefixsug=c%252B%252B&rsp=2&inputT=1160&rsv_sug4=1161";
        String []a=url.split("://");
        System.out.println("协议名称"+ a[0]);
        String[]b=a[1].split("/");

        String []c=b[1].split("/?");
        System.out.println(c[0]);
        String[]d=c[1].split("=");
        System.out.println(d[0]);
    }
}
