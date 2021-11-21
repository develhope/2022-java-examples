package it.develhope.annotations;


import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start {

    @MyAnnotation(isInProgress = true)
    public  static void main(String ...args){
        Annotation[] annotations = AnnotationClass.class.getAnnotations();
        System.out.println("---- " + AnnotationClass.class.getName());
        Arrays.stream(annotations).forEach(annotation->{
            MyAnnotation single = (MyAnnotation)annotation;
            System.out.println("---- " + single.isInProgress() + " ----");
        });


        Arrays.stream(AnnotationClass.class.getMethods()).forEach(method-> {
            System.out.println("---- " + method.getName() + " ----");
        });
        System.out.println("-------------------------------------------------------");

        List myList = new ArrayList<>();
        myList.add(new ClassWithoutAnnotation());
        myList.add(new AnnotationClass());

        myList.forEach(single ->{
            System.out.println("---- " + single.getClass().getName());
            Arrays.stream(single.getClass().getAnnotations()).forEach(annotation -> {
                if(annotation instanceof MyAnnotation){
                    MyAnnotation singleAnnotationCast = (MyAnnotation)annotation;
                    System.out.println("---- " + singleAnnotationCast.isInProgress() + " ----");
                }
            });
        });
    }
}
