package bg.tu_varna.sit.a4.f22621677;

import java.util.HashMap;


 public class SVGFigure {
     private String tag;
     private HashMap<String, String> attributes;

     public SVGFigure(String tag, HashMap<String, String> attributes) {
         this.tag = tag;
         this.attributes = attributes;
     }
     @Override
     public String toString() {
         StringBuilder sb = new StringBuilder();
         sb.append("<").append(tag);
         for (String key : attributes.keySet()) {
             sb.append(" ").append(key).append("=\"").append(attributes.get(key)).append("\"");
         }
         sb.append(" />");
         return sb.toString();
     }
 }
