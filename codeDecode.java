public class Codec {

    // Encodes a URL to a shortened URL.
    HashMap<String,String> encrypt = new HashMap<String,String>();
    public String encode(String longUrl) {
        String random = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789"+"abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(10);
        for (int i = 0; i < 10; i++) {
             int index=(int)(random.length()*Math.random());
             sb.append(random.charAt(index));
        }
        String tinyurl=sb.toString();
        if(!encrypt.containsKey(tinyurl))
            encrypt.put(tinyurl,longUrl);
         return tinyurl;
    }
