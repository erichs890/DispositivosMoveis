class Livro(val titulo: String, val autor: String, val numPag: Int){
    var emprestado:Boolean = false
    fun emprestar(): Unit{
        if (emprestado == true){
            println("O livro já foi emprestado.")
        } else{
            emprestado = true
            println("Livro emprestado com sucesso")
        }
    }
    fun devolucao():Unit{
        if(emprestado==false){
            println("O livro foi devolvido com sucesso.")
        }else {
            println("O livro ja foi devolvido")
        }
    }
    fun estaDisponivel(): Boolean{
        if(emprestado){
            return false
        }else{
            return true
        }
    }
}
class biblioteca{
    var livros: Array<Livro> = emptyArray()
    fun cadastrarLivro(livro: Livro){
        livros += livro
        println("Livro cadastrado com sucesso.")
    }
    fun totalLivros():Int{
        return livros.size
    }
    fun livrosEmprestados():Int{
        var contador:Int = 0
        for(livro in livros){
            if(livro.emprestado){
                contador ++
            }
        }
        return contador
    }
    fun livrosDisponiveis():Int{
        return totalLivros()-livrosEmprestados()
    }
    fun verInfo(){
        println("Total de livros: ${totalLivros()}")
        println("Livros emprestados: ${livrosEmprestados()}")
        println("Livros disponíveis para empréstimos: ${livrosDisponiveis()}")
        println("")
    }
}
fun main() {
    val livro1 = Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1000)
    val livro2 = Livro("Harry Potter", "J.K. Rowling", 500)
    val biblioteca = biblioteca()
    biblioteca.cadastrarLivro(livro1)
    biblioteca.cadastrarLivro(livro2)
    biblioteca.verInfo()
    livro1.emprestar()
    livro2.emprestar()
    biblioteca.verInfo()
    livro1.devolucao()
    biblioteca.verInfo()
}
