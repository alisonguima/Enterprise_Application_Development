using System;
using System.Collections.Generic;
using System.Text;

namespace Fiap.Aula01.Exemplo01.Models
{
    //Classe abstract -> não pode ser instanciada, e pode ter métodos abstratos
    abstract class Produto
    {
        //Propriedades (Getters e Setters) Peso, Nome, Preço
        //prop -> tab tab (Cria a propriedade)
        public float Peso { get; set; }
        public string Nome { get; set; }
        public decimal Preco { get; set; }

        //Construtor com nome e preco
        public Produto(string nome, decimal preco)
        {
            Nome = nome;
            Preco = preco;
        }

        //Métodos
        //Sobrecarga (overload) de métodos -> método com mesmo nome, na mesma classe e parâmetros diferentes (tipo, ordem, qtd)
        public decimal CalcularDesconto(decimal porcentagem)
        {
            return Preco - Preco * (porcentagem / 100);
        }

        public virtual decimal CalcularDesconto(string cupom)
        {
            //o cupom FIAP30 da 30% de desconto
            if (cupom == "FIAP30")
            {
                return Preco * 0.70m;
            }
            return Preco;
        }

        //virtual -> permite a sobrescrita do método
        public virtual decimal CalcularDesconto()
        {
            //Retornar o valor do produto com o desconto padrão de 5%
            return Preco * 0.95m; //m no final do número para defini-lo com o tipo decimal 
        }

        public void AumentarPreco(decimal juros)
        {
            //Aumentar o preço do produto de acordo com o juros (10%, 20%)
            Preco += Preco * juros / 100;
        }

        //Método abstrato, sem implementação, termina com ;
        public abstract void Reparar();
    }
}
