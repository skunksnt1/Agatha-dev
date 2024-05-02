package br.gov.mpog.gestaoriscos.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Processo.class)
public abstract class Processo_ extends br.gov.mpog.gestaoriscos.modelo.base.ProcessoBase_ {

	public static volatile SingularAttribute<Processo, Identificacao> identificacao;
	public static volatile ListAttribute<Processo, ProcessoAnexo> anexos;
	public static volatile SingularAttribute<Processo, DecisaoProcesso> decisao;
	public static volatile SingularAttribute<Processo, Analise> analise;
	public static volatile ListAttribute<Processo, Responsavel> responsaveis;
	public static volatile SingularAttribute<Processo, Usuario> gestor;
	public static volatile SingularAttribute<Processo, Avaliacao> avaliacao;
	public static volatile SingularAttribute<Processo, Macroprocesso> macroprocesso;
	public static volatile SingularAttribute<Processo, Calculadora> calculadora;
	public static volatile SingularAttribute<Processo, StatusProcesso> status;

}

