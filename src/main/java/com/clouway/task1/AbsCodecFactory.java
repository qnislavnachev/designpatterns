package com.clouway.task1;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public class AbsCodecFactory {

    public CodecFactory getFacory(String type) {
        if (type.equals("new")) {
            return new RegularCodecFactory();
        } else if(type.equals("ref")){
            return new ReflectionCodecFactory();
        }else{
            return null;
        }
    }
}
