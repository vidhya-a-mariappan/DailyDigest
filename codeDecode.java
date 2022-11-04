public class Codec {

    // Encodes a URL to a shortened URL.
    HashMap<String,String> encrypt = new HashMap<String,String>();
    public String encode(String longUrl) {
        String tinyurl=generateRandom();
        if(encrypt.containsKey(tinyurl))
            generateRandom();
        else
           encrypt.put(tinyurl,longUrl);
         return tinyurl;
    }
        private String generateRandom(){
        String random = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789"+"abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(10);
            String surl="";
        for (int i = 0; i < 10; i++) {
             int index=(int)(random.length()*Math.random());
             sb.append(random.charAt(index));
             surl="http://tinyurl.com/"+sb.toString();
           }
             return surl;
        }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String decrypt="";
         for (Map.Entry<String,String> url :encrypt.entrySet()) {
            if(url.getKey().equals(shortUrl))
               decrypt=url.getValue();
        }
        return decrypt;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
