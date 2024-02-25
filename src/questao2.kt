class Livro(val titulo: String, val autor: String, val numPag: Int){
    var emprestado:Boolean = false
    fun emprestar(){
        if (emprestado == true){
            println("O livro já foi emprestado.")
        } else{
            emprestado = true
            println("Livro emprestado com sucesso")
        }
        fun devolver(){
            if(emprestado==false){
                println("O livro foi devolvido com sucesso.")
            }else{
                println("O livro ja foi devolvido")
            }
        }
    }
}