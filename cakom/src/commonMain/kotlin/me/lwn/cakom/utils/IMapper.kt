package me.lwn.cakom.utils

/**
 * DTO与DomainModel相互转化的帮助类
 *
 * Created by fatterx on 2022/4/04
 *
 */
interface IMapper<DTO, DomainModel> {
    fun toDomainModel(dto: DTO): DomainModel

    fun toDTO(domainModel: DomainModel): DTO

    fun toDomainModels(dtoList: List<DTO>): List<DomainModel>

    fun toDTOs(domainModels: List<DomainModel>): List<DTO>
}