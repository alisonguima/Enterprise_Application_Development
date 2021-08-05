using System;
using Fiap.Aula01.Exemplo01.Models;

namespace Fiap.Aula01.Exemplo01
{
   /*
    * ALT + Enter ou CTRL + . (Sugestão de correção)
    * prop, cw -> tab tab
    * 
    * Solution -> Workspace
    * Project -> Project
    * Namespace -> Package
    * using -> import
    * base -> super
    * : -> extends 
    * 
    * Sobrescrever um método: 
    * override -> palavra reservada para sobresrita de método 
    * virtual -> permite a sobrescrita de método
    * abstract -> método abstrato
    * 
    * Padrão de nomenclatura: 
    *      Métodos/Classes - UpperCamelCase
    *      Atributos - Começa com "_"
    *      
    * Tipos de dados (Não tem primitivo, int long, bool, string são abreviaturas para as Classes/Estruturas)
    * $"" -> Interpolação de String, permite adicionar valores na String através das {}
    * xxx.Parse() -> Transforma a String no tipo x
    * 
    * Modificadores de acesso:
    * public -> Todos
    * private -> Somente as classes
    * protected -> Somente a classe e classes filhas
    * internal -> Todos do mesmo projeto
    * protected internal -> Somente a classe, classes filhas e todos do mesmo projeto
    * protected private -> Somente a classe e classes filhas no mesmo projeto
    * 
    */
    class Program
    {   
        static void Main(string[] args)
        {
            //Instanciar um Aluno e atribuir um nome
            Aluno aluno = new Aluno();
            aluno.Nome = "Lucas"; //Set
            aluno.Rm = 84601;
            Console.WriteLine(aluno.Nome + " " + aluno.Rm); //Get

            //Ler os dados do Produto
            Console.WriteLine("Digite o nome");
            string nome = Console.ReadLine();

            //cw -> tab tab (Console.WriteLine())
            Console.WriteLine("Digite o peso");
            float peso = float.Parse(Console.ReadLine());

            Console.WriteLine("Digite o preço");
            decimal preco = decimal.Parse(Console.ReadLine());

            Console.WriteLine("Digite a voltagem");
            int voltagem = int.Parse(Console.ReadLine());
            
            //Instanciar um produto
            Produto produto = new Eletronico (nome, preco, voltagem)
            {
                Peso = peso
            };
            //CTRL + K + C (Comenta o que está selecionado)
            //produto.Nome = nome;
            //produto.Preco = preco;
            //produto.Peso = peso;

            //Exibir os dados do produto
            Console.WriteLine($"Nome: {produto.Nome}, Preço: {produto.Preco}, Peso: {produto.Peso}");

            //Ler o juros
            Console.WriteLine("Digite o juros");
            decimal juros = decimal.Parse(Console.ReadLine());

            //Aumentar o preço produto
            produto.AumentarPreco(juros);

            //Aumentar o preco e exibir o novo preço
            Console.WriteLine($"Novo preço: {produto.Preco}");

            //Ler o cupom
            Console.WriteLine("Digite o cupom");
            string cupom = Console.ReadLine();

            //Exibir o valor com desconto
            Console.WriteLine($"O valor com desconto é {produto.CalcularDesconto(cupom)}");

            Console.WriteLine(produto); //Tarefa, ajudar o resultado
        }
    }
}
