package com.example.gsonparse

import com.google.gson.annotations.SerializedName

data class ExampleModel(
    val id: String?,
    val projectId: String?,
    val status: String?,
    val requestBy: String?,
    val acceptedBy: Any?,
    val author: String?,
    val category: String?,
    val locations: Locations?,
    val filters: List<Filter>?,
    val type: String?,
    val organization: String?,
    val address: String?,
    val startDate: String?,
    val endDate: String?,
    val description: String?,
    val prolongDates: List<Any>?,
    val releaseDates: List<Any>?,
    val isDummy: Boolean?,
    val hasDriver: Boolean?,
    val overwriteDate: Any?,
    val metaInfo: Any?,
    val warehouseId: Any?,
    val rentalDescription: Any?,
    val internalTransportations: InternalTransportations?,
    val startDateMilliseconds: Long?,
    val endDateMilliseconds: Long?,
    val equipment: Equipment?
) {
    data class Locations(
        val type: String?,
        val coordinates: List<Double>?,
    )

    data class Filter(
        val name: String?,
        val value: Value?
    )

    data class Value(
        val max: Int?,
        val min: Int?
    )

    data class InternalTransportations(
        val id: String?,
        val projectRequestId: String?,
        val pickUpDate: String?,
        val deliveryDate: String?,
        val description: Any?,
        val status: String?,
        val startDateOption: Any?,
        val endDateOption: Any?,
        val pickUpLocation: Locations?,
        val deliveryLocation: Locations?,
        val provider: String?,
        val pickUpLocationAddress: String?,
        val deliveryLocationAddress: String?,
        val pGroup: String?,
        val isOrganizedWithoutSam: Any?,
        val templatePGroup: String?,
        val pickUpDateMilliseconds: Long?,
        val deliveryDateMilliseconds: Long?,
        val startDateOptionMilliseconds: Any?,
        val endDateOptionMilliseconds: Any?
    )

    data class Equipment(
        val id: String?,
        val title: String?,
        val invNumber: String?,
        val categoryId: String?,
        val modelId: String?,
        val brandId: String?,
        val year: Int?,
        val specifications: List<Specification>?,
        val weight: Int?,
        @SerializedName("additional_specifications")
        val additionalSpecifications: Any?,
        val structureId: String?,
        val organizationId: String?,
        val beaconType: Any?,
        val beaconId: String?,
        val beaconVendor: String?,
        @SerializedName("RFID")
        val rFID: String?,
        val dailyPrice: Any?,
        val inactive: Any?,
        val tag: Tag?,
        val telematicBox: Any?,
        val createdAt: String?,
        @SerializedName("special_number")
        val specialNumber: Any?,
        @SerializedName("last_check")
        val lastCheck: String?,
        @SerializedName("next_check")
        val nextCheck: String?,
        @SerializedName("responsible_person")
        val responsiblePerson: Any?,
        @SerializedName("test_type")
        val testType: Any?,
        @SerializedName("unique_equipment_id")
        val uniqueEquipmentId: String?,
        @SerializedName("bgl_number")
        val bgl_number: String?,
        @SerializedName("serial_number")
        val serialNumber: Any?,
        val inventory: Any?,
        val warehouseId: String?,
        val trackingTag: Any?,
        val workingHours: Any?,
        @SerializedName("navaris_criteria")
        val navarisCriteria: Any?,
        @SerializedName("dont_send_to_as400")
        val dontSendToAs400: Boolean?,
        val model: Model?,
        val brand: Brand?,
        val category: Category,
        val structure: Structure?,
        val wareHouse: Any?,
        val equipmentMedia: List<EquipmentMedia>?,
        val telematics: List<Telematic>?,
        val isMoving: Boolean?
    )

    data class Specification(
        val key: String?,
        val value: Any?
    )

    data class Tag(
        val date: String?,
        val authorName: String?,
        val media: List<Any>?,
    )

    data class Model(
        val id: String?,
        val name: String?,
        val createdAt: String?,
        val brand: Brand?
    )

    data class Brand(
        val id: String?,
        val name: String?,
        val createdAt: String?
    )

    data class Category(
        val id: String?,
        val name: String?,
        @SerializedName("name_de")
        val nameDe: String?,
        val createdAt: String?,
        val media: List<Any>?
    )

    data class Structure(
        val id: String?,
        val name: String?,
        val type: String?,
        val color: String?,
    )

    data class EquipmentMedia(
        val id: String?,
        val name: String?,
        val files: List<File>?,
        val type: String?,
        val modelId: String?,
        val main: Boolean?,
        val modelType: String?,
        val createdAt: String?
    )

    data class File(
        val size: String?,
        val path: String?
    )

    data class Telematic(
        val timestamp: Long?,
        val eventType: String?,
        val projectId: String?,
        val equipmentId: String?,
        val locationName: String?,
        val location: Location?,
        val costCenter: String?,
        val lastLatitude: Double?,
        val lastLongitude: Double?,
        val lastLatLonPrecise: Boolean?,
        val lastAddressByLatLon: String?
    )

    data class Location(
        val type: String?,
        val coordinates: List<List<List<List<Double>>>>
    )
}
