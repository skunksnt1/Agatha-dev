package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.ProbabilidadeCalculadora;

import br.gov.mpog.gestaoriscos.modelo.dto.ProbabilidadeCalculadoraDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:22-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class ProbabilidadeCalculadoraMapperImpl implements ProbabilidadeCalculadoraMapper {

    @Override

    public ProbabilidadeCalculadoraDTO probabilidadeCalculadoraToProbabilidadeCalculadoraDTO(ProbabilidadeCalculadora probabilidadeCalculadora) {

        if ( probabilidadeCalculadora == null ) {

            return null;
        }

        ProbabilidadeCalculadoraDTO probabilidadeCalculadoraDTO = new ProbabilidadeCalculadoraDTO();

        probabilidadeCalculadoraDTO.setId( probabilidadeCalculadora.getId() );

        probabilidadeCalculadoraDTO.setExcluido( probabilidadeCalculadora.isExcluido() );

        probabilidadeCalculadoraDTO.setNome( probabilidadeCalculadora.getNome() );

        probabilidadeCalculadoraDTO.setFrequencia( probabilidadeCalculadora.getFrequencia() );

        return probabilidadeCalculadoraDTO;
    }

    @Override

    public List<ProbabilidadeCalculadoraDTO> probabilidadeCalculadorasToProbabilidadeCalculadoraDTOs(List<ProbabilidadeCalculadora> probabilidadeCalculadoras) {

        if ( probabilidadeCalculadoras == null ) {

            return null;
        }

        List<ProbabilidadeCalculadoraDTO> list = new ArrayList<ProbabilidadeCalculadoraDTO>();

        for ( ProbabilidadeCalculadora probabilidadeCalculadora : probabilidadeCalculadoras ) {

            list.add( probabilidadeCalculadoraToProbabilidadeCalculadoraDTO( probabilidadeCalculadora ) );
        }

        return list;
    }

    @Override

    public ProbabilidadeCalculadora probabilidadeCalculadoraDTOToProbabilidadeCalculadora(ProbabilidadeCalculadoraDTO probabilidadeCalculadoraDTO) {

        if ( probabilidadeCalculadoraDTO == null ) {

            return null;
        }

        ProbabilidadeCalculadora probabilidadeCalculadora = new ProbabilidadeCalculadora();

        probabilidadeCalculadora.setExcluido( probabilidadeCalculadoraDTO.isExcluido() );

        probabilidadeCalculadora.setNome( probabilidadeCalculadoraDTO.getNome() );

        probabilidadeCalculadora.setId( probabilidadeCalculadoraDTO.getId() );

        probabilidadeCalculadora.setFrequencia( probabilidadeCalculadoraDTO.getFrequencia() );

        return probabilidadeCalculadora;
    }

    @Override

    public List<ProbabilidadeCalculadora> probabilidadeCalculadoraDTOsToProbabilidadeCalculadoras(List<ProbabilidadeCalculadoraDTO> probabilidadeCalculadoraDTOs) {

        if ( probabilidadeCalculadoraDTOs == null ) {

            return null;
        }

        List<ProbabilidadeCalculadora> list = new ArrayList<ProbabilidadeCalculadora>();

        for ( ProbabilidadeCalculadoraDTO probabilidadeCalculadoraDTO : probabilidadeCalculadoraDTOs ) {

            list.add( probabilidadeCalculadoraDTOToProbabilidadeCalculadora( probabilidadeCalculadoraDTO ) );
        }

        return list;
    }
}

