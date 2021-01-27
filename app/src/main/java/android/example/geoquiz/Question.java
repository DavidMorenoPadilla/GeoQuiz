package android.example.geoquiz;

/*Clase que nos  encapsulara cada una de las preguntas*/
public class Question {

    /*mTextResId contiene el ID númerico de un recurso de tipo String*/
    private int mTextResId;
    /*mAnswerTrue contiene la respuesta a la pregunta señalada en el ID anterior*/
    private boolean mAnswerTrue;

    /*Constructor de los objetos de la clase*/
    public Question(int textResId, boolean answerTrue){
        mTextResId=textResId;
        mAnswerTrue=answerTrue;
    }

    /*Setter y Getter generados por el IDE*/
    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
