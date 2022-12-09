package multilang.bybug.multilang;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;

import java.util.Objects;


public class MultiLang extends AndroidNonvisibleComponent {

  public MultiLang(ComponentContainer container) {
    super(container.$form());
  }
  @SimpleFunction
  public String SetLanguage(String SystemLanguage,String tr,String en,String ru,String ar,String ko,String sk,String fr,String de,String ga,String no){
    String returnText = "";
    if (Objects.equals(SystemLanguage, tr)){
      returnText=tr;
    } else if (Objects.equals(SystemLanguage, en)) {
      returnText=en;
    }
    else if (Objects.equals(SystemLanguage, ru)) {
      returnText=ru;
    }
    else if (Objects.equals(SystemLanguage, ar)) {
      returnText=ar;
    }
    else if (Objects.equals(SystemLanguage, ko)) {
      returnText=ko;
    }
    else if (Objects.equals(SystemLanguage, sk)) {
      returnText=sk;
    }
    else if (Objects.equals(SystemLanguage, fr)) {
      returnText=fr;
    }
    else if (Objects.equals(SystemLanguage, de)) {
      returnText=de;
    }
    else if (Objects.equals(SystemLanguage, ga)) {
      returnText=ga;
    }
    else if (Objects.equals(SystemLanguage, no)) {
      returnText=no;
    }
    return returnText;
  }

  @SimpleFunction
  public String NullText() {
    return "";
  }
  @SimpleProperty
  public String en(){
    return "en";
  }  @SimpleProperty
  public String ru(){
    return "ru";
  }  @SimpleProperty
  public String ar(){
    return "ar";
  }  @SimpleProperty
  public String ko(){
    return "ko";
  }  @SimpleProperty
  public String sk(){
    return "sk";
  }  @SimpleProperty
  public String fr(){
    return "fr";
  }  @SimpleProperty
  public String de(){
    return "de";
  }  @SimpleProperty
  public String ga(){
    return "ga";
  }  @SimpleProperty
  public String no(){
    return "no";
  }
}
