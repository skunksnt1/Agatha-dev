package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.ObjetivoControle;

import br.gov.mpog.gestaoriscos.modelo.dto.ObjetivoControleDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:20-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class ObjetivoControleMapperImpl implements ObjetivoControleMapper {

    @Override

    public ObjetivoControleDTO objetivoControleToObjetivoControleDTO(ObjetivoControle objetivoControle) {

        if ( objetivoControle == null ) {

            return null;
        }

        ObjetivoControleDTO objetivoControleDTO = new ObjetivoControleDTO();

        objetivoControleDTO.setId( objetivoControle.getId() );

        objetivoControleDTO.setExcluido( objetivoControle.isExcluido() );

        objetivoControleDTO.setNome( objetivoControle.getNome() );

        return objetivoControleDTO;
    }

    @Override

    public List<ObjetivoControleDTO> objetivoControlesToObjetivoControleDTOs(List<ObjetivoControle> objetivoControles) {

        if ( objetivoControles == null ) {

            return null;
        }

        List<ObjetivoControleDTO> list = new ArrayList<ObjetivoControleDTO>();

        for ( ObjetivoControle objetivoControle : objetivoControles ) {

            list.add( objetivoControleToObjetivoControleDTO( objetivoControle ) );
        }

        return list;
    }

    @Override

    public ObjetivoControle objetivoControleDTOToObjetivoControle(ObjetivoControleDTO objetivoControleDTO) {

        if ( objetivoControleDTO == null ) {

            return null;
        }

        ObjetivoControle objetivoControle = new ObjetivoControle();

        objetivoControle.setExcluido( objetivoControleDTO.isExcluido() );

        objetivoControle.setNome( objetivoControleDTO.getNome() );

        objetivoControle.setId( objetivoControleDTO.getId() );

        return objetivoControle;
    }

    @Override

    public List<ObjetivoControle> objetivoControleDTOsToObjetivoControles(List<ObjetivoControleDTO> objetivoControleDTOs) {

        if ( objetivoControleDTOs == null ) {

            return null;
        }

        List<ObjetivoControle> list = new ArrayList<ObjetivoControle>();

        for ( ObjetivoControleDTO objetivoControleDTO : objetivoControleDTOs ) {

            list.add( objetivoControleDTOToObjetivoControle( objetivoControleDTO ) );
        }

        return list;
    }
}

