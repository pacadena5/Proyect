
package encryptedpassword;


public class Encryption {
    
    public String encryptPassword(String pass)
    {
        try{
            java.security.MessageDigest ja= java.security.MessageDigest.getInstance("pass");
            
            byte[] array = ja.digest(pass.getBytes());
            
            StringBuffer sb=new StringBuffer();
            
            for(int i=0; i<array.length; i++){
                
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
            }
        return sb.toString();
        }catch(java.security.NoSuchAlgorithmException e){  
        
        }
        
        return null;
    
    }
    
}
