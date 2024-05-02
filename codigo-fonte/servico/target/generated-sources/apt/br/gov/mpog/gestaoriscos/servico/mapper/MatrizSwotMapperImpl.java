package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.MatrizSwot;

import br.gov.mpog.gestaoriscos.modelo.dto.MatrizSwotDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:20-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class MatrizSwotMapperImpl implements MatrizSwotMapper {

    @Autowired

    private TipoMatrizMapper tipoMatrizMapper;

    @Override

    public MatrizSwotDTO matrizSwotToMatrizSwotDTO(MatrizSwot matrizSwot) {

        if ( matrizSwot == null ) {

            return null;
        }

        MatrizSwotDTO matrizSwotDTO = new MatrizSwotDTO();

        matrizSwotDTO.setExcluido( matrizSwot.isExcluido() );

        matrizSwotDTO.setId( matrizSwot.getId() );

        matrizSwotDTO.setDescricao( matrizSwot.getDescricao() );

        matrizSwotDTO.setTipoMatriz( tipoMatrizMapper.tipoMatrizToTipoMatrizDTO( matrizSwot.getTipoMatriz() ) );

        return matrizSwotDTO;
    }

    @Override

    public List<MatrizSwotDTO> matrizSwotsToMatrizSwotDTOs(List<MatrizSwot> matrizSwots) {

        if ( matrizSwots == null ) {

            return null;
        }

        List<MatrizSwotDTO> list = new ArrayList<MatrizSwotDTO>();

        for ( MatrizSwot matrizSwot : matrizSwots ) {

            list.add( matrizSwotToMatrizSwotDTO( matrizSwot ) );
        }

        return list;
    }

    @Override

    public MatrizSwot matrizSwotDTOToMatrizSwot(MatrizSwotDTO matrizSwotDTO) {

        if ( matrizSwotDTO == null ) {

            return null;
        }

        MatrizSwot matrizSwot = new MatrizSwot();

        matrizSwot.setExcluido( matrizSwotDTO.isExcluido() );

        matrizSwot.setId( matrizSwotDTO.getId() );

        matrizSwot.setDescricao( matrizSwotDTO.getDescricao() );

        matrizSwot.setTipoMatriz( tipoMatrizMapper.tipoMatrizDTOToTipoMatriz( matrizSwotDTO.getTipoMatriz() ) );

        return matrizSwot;
    }

    @Override

    public List<MatrizSwot> matrizSwotDTOsToMatrizSwots(List<MatrizSwotDTO> matrizSwotDTOs) {

        if ( matrizSwotDTOs == null ) {

            return null;
        }

        List<MatrizSwot> list = new ArrayList<MatrizSwot>();

        for ( MatrizSwotDTO matrizSwotDTO : matrizSwotDTOs ) {

            list.add( matrizSwotDTOToMatrizSwot( matrizSwotDTO ) );
        }

        return list;
    }
}

