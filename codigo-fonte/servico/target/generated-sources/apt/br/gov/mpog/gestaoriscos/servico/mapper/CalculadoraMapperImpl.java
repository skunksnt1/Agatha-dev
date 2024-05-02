package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.Calculadora;

import br.gov.mpog.gestaoriscos.modelo.ImpactoCalculadora;

import br.gov.mpog.gestaoriscos.modelo.ProbabilidadeCalculadora;

import br.gov.mpog.gestaoriscos.modelo.dto.CalculadoraDTO;

import br.gov.mpog.gestaoriscos.modelo.dto.ImpactoCalculadoraDTO;

import br.gov.mpog.gestaoriscos.modelo.dto.ProbabilidadeCalculadoraDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:19-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class CalculadoraMapperImpl implements CalculadoraMapper {

    @Autowired

    private ImpactoCalculadoraMapper impactoCalculadoraMapper;

    @Autowired

    private ProbabilidadeCalculadoraMapper probabilidadeCalculadoraMapper;

    @Override

    public CalculadoraDTO calculadoraToCalculadoraDTO(Calculadora calculadora) {

        if ( calculadora == null ) {

            return null;
        }

        CalculadoraDTO calculadoraDTO = new CalculadoraDTO();

        calculadoraDTO.setId( calculadora.getId() );

        calculadoraDTO.setExcluido( calculadora.isExcluido() );

        List<ImpactoCalculadoraDTO> list = impactoCalculadoraMapper.impactoCalculadorasToImpactoCalculadoraDTOs( calculadora.getImpactos() );

        if ( list != null ) {

            calculadoraDTO.setImpactos( list );
        }

        List<ProbabilidadeCalculadoraDTO> list_ = probabilidadeCalculadoraMapper.probabilidadeCalculadorasToProbabilidadeCalculadoraDTOs( calculadora.getProbabilidades() );

        if ( list_ != null ) {

            calculadoraDTO.setProbabilidades( list_ );
        }

        return calculadoraDTO;
    }

    @Override

    public List<CalculadoraDTO> calculadorasToCalculadoraDTOs(List<Calculadora> calculadoras) {

        if ( calculadoras == null ) {

            return null;
        }

        List<CalculadoraDTO> list = new ArrayList<CalculadoraDTO>();

        for ( Calculadora calculadora : calculadoras ) {

            list.add( calculadoraToCalculadoraDTO( calculadora ) );
        }

        return list;
    }

    @Override

    public Calculadora calculadoraDTOToCalculadora(CalculadoraDTO calculadoraDTO) {

        if ( calculadoraDTO == null ) {

            return null;
        }

        Calculadora calculadora = new Calculadora();

        calculadora.setId( calculadoraDTO.getId() );

        calculadora.setExcluido( calculadoraDTO.isExcluido() );

        List<ImpactoCalculadora> list = impactoCalculadoraMapper.impactoCalculadoraDTOsToImpactoCalculadoras( calculadoraDTO.getImpactos() );

        if ( list != null ) {

            calculadora.setImpactos( list );
        }

        List<ProbabilidadeCalculadora> list_ = probabilidadeCalculadoraMapper.probabilidadeCalculadoraDTOsToProbabilidadeCalculadoras( calculadoraDTO.getProbabilidades() );

        if ( list_ != null ) {

            calculadora.setProbabilidades( list_ );
        }

        return calculadora;
    }

    @Override

    public List<Calculadora> calculadoraDTOsToCalculadoras(List<CalculadoraDTO> calculadoraDTOs) {

        if ( calculadoraDTOs == null ) {

            return null;
        }

        List<Calculadora> list = new ArrayList<Calculadora>();

        for ( CalculadoraDTO calculadoraDTO : calculadoraDTOs ) {

            list.add( calculadoraDTOToCalculadora( calculadoraDTO ) );
        }

        return list;
    }
}

