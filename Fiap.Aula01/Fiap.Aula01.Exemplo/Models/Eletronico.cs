using System;
using System.Collections.Generic;
using System.Text;

namespace Fiap.Aula01.Exemplo01.Models
{
    class Eletronico : Produto
    {
        //Propriedades (Voltagem, Modelo)

        public int Voltagem { get; set; }
        public string Modelo { get; set; }

        //Construtor
        //base -> chama um construtor do pai (Produto)
        public Eletronico(string nome, decimal preco, int voltagem) : base(nome, preco)
        {
            Voltagem = voltagem;
        }

        //Métodos
        //Sobrescrita (Override) -> alterar/adiconar um comportamento do método do pai
        //Implementa na filha o mesmo método do pai
        public override decimal CalcularDesconto()
        {   
            //Retorna o preço com 10% de desconto
            return Preco * 0.90m;
        }

        //Sobrescrever o método CalcularDesconto(cupom) adicionando o cupom FIAP50, que da 50%
        public override decimal CalcularDesconto(string cupom)
        {
            //o cupom FIAP30 da 30% de desconto
            if (cupom == "FIAP50")
            {
                return Preco * 0.5m;
            }
            return base.CalcularDesconto(cupom);
        }

        //override -> palavra reservada
        public override void Reparar()
        {
            Console.WriteLine($"reparando o {Modelo}");
        }
    }
}
