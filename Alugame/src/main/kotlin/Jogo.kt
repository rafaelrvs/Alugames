import com.google.gson.annotations.SerializedName

data class Jogo ( val titulo:String ,
                  val capa: String ){
    var descricao = ""


    override fun toString(): String {
        return "Jogo:" +
                " Ttulo = $titulo,\n" +
                "Capa:$capa,\n"+
                "Descrição: $descricao"
    }

}
