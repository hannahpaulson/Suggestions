package com.example.hannahpaulson.suggestions

import com.squareup.moshi.Json


data class SearchResponse(
        @Json(name = "q") val q: String,
        @Json(name = "from") val from: Int,
        @Json(name = "to") val to: Int,
        @Json(name = "params") val params: Params,
        @Json(name = "more") val more: Boolean,
        @Json(name = "count") val count: Int,
        @Json(name = "hits") val hits: List<Hit>
) {

    data class Hit(
            @Json(name = "recipe") val recipe: Recipe,
            @Json(name = "bookmarked") val bookmarked: Boolean,
            @Json(name = "bought") val bought: Boolean
    ) {

        data class Recipe(
                @Json(name = "uri") val uri: String,
                @Json(name = "label") val label: String,
                @Json(name = "image") val image: String,
                @Json(name = "source") val source: String,
                @Json(name = "url") val url: String,
                @Json(name = "shareAs") val shareAs: String,
                @Json(name = "yield") val yield: Int,
                @Json(name = "dietLabels") val dietLabels: List<String>,
                @Json(name = "healthLabels") val healthLabels: List<String>,
                @Json(name = "cautions") val cautions: List<Any>,
                @Json(name = "ingredientLines") val ingredientLines: List<String>,
                @Json(name = "ingredients") val ingredients: List<Ingredient>,
                @Json(name = "calories") val calories: Double,
                @Json(name = "totalWeight") val totalWeight: Double,
                @Json(name = "totalTime") val totalTime: Int,
                @Json(name = "totalNutrients") val totalNutrients: TotalNutrients,
                @Json(name = "totalDaily") val totalDaily: TotalDaily,
                @Json(name = "digest") val digest: List<Digest>
        ) {

            data class Digest(
                    @Json(name = "label") val label: String,
                    @Json(name = "tag") val tag: String,
                    @Json(name = "schemaOrgTag") val schemaOrgTag: Any,
                    @Json(name = "total") val total: Double,
                    @Json(name = "hasRDI") val hasRDI: Boolean,
                    @Json(name = "daily") val daily: Double,
                    @Json(name = "unit") val unit: String,
                    @Json(name = "sub") val sub: List<Sub>
            ) {

                data class Sub(
                        @Json(name = "label") val label: String,
                        @Json(name = "tag") val tag: String,
                        @Json(name = "schemaOrgTag") val schemaOrgTag: Any,
                        @Json(name = "total") val total: Float,
                        @Json(name = "hasRDI") val hasRDI: Boolean,
                        @Json(name = "daily") val daily: Float,
                        @Json(name = "unit") val unit: String
                )
            }


            data class Ingredient(
                    @Json(name = "text") val text: String,
                    @Json(name = "weight") val weight: Float
            )


            data class TotalNutrients(
                    @Json(name = "ENERC_KCAL") val eNERCKCAL: ENERCKCAL,
                    @Json(name = "FAT") val fAT: FAT,
                    @Json(name = "FASAT") val fASAT: FASAT,
                    @Json(name = "FATRN") val fATRN: FATRN,
                    @Json(name = "FAMS") val fAMS: FAMS,
                    @Json(name = "FAPU") val fAPU: FAPU,
                    @Json(name = "CHOCDF") val cHOCDF: CHOCDF,
                    @Json(name = "FIBTG") val fIBTG: FIBTG,
                    @Json(name = "SUGAR") val sUGAR: SUGAR,
                    @Json(name = "PROCNT") val pROCNT: PROCNT,
                    @Json(name = "CHOLE") val cHOLE: CHOLE,
                    @Json(name = "NA") val nA: NA,
                    @Json(name = "CA") val cA: CA,
                    @Json(name = "MG") val mG: MG,
                    @Json(name = "K") val k: K,
                    @Json(name = "FE") val fE: FE,
                    @Json(name = "ZN") val zN: ZN,
                    @Json(name = "P") val p: P,
                    @Json(name = "VITA_RAE") val vITARAE: VITARAE,
                    @Json(name = "VITC") val vITC: VITC,
                    @Json(name = "THIA") val tHIA: THIA,
                    @Json(name = "RIBF") val rIBF: RIBF,
                    @Json(name = "NIA") val nIA: NIA,
                    @Json(name = "VITB6A") val vITB6A: VITB6A,
                    @Json(name = "FOLDFE") val fOLDFE: FOLDFE,
                    @Json(name = "FOLFD") val fOLFD: FOLFD,
                    @Json(name = "VITB12") val vITB12: VITB12,
                    @Json(name = "VITD") val vITD: VITD,
                    @Json(name = "TOCPHA") val tOCPHA: TOCPHA,
                    @Json(name = "VITK1") val vITK1: VITK1
            ) {

                data class CHOCDF(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class VITB6A(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class PROCNT(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class FOLDFE(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class FASAT(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class TOCPHA(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class P(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class CA(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class FE(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class MG(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class K(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class FATRN(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class CHOLE(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class VITARAE(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class ENERCKCAL(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class NIA(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class VITB12(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class NA(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class FIBTG(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class FAPU(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class THIA(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class VITK1(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class FAT(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class SUGAR(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class ZN(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class FAMS(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class RIBF(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class FOLFD(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class VITD(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class VITC(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )
            }


            data class TotalDaily(
                    @Json(name = "ENERC_KCAL") val eNERCKCAL: ENERCKCAL,
                    @Json(name = "FAT") val fAT: FAT,
                    @Json(name = "FASAT") val fASAT: FASAT,
                    @Json(name = "CHOCDF") val cHOCDF: CHOCDF,
                    @Json(name = "FIBTG") val fIBTG: FIBTG,
                    @Json(name = "PROCNT") val pROCNT: PROCNT,
                    @Json(name = "CHOLE") val cHOLE: CHOLE,
                    @Json(name = "NA") val nA: NA,
                    @Json(name = "CA") val cA: CA,
                    @Json(name = "MG") val mG: MG,
                    @Json(name = "K") val k: K,
                    @Json(name = "FE") val fE: FE,
                    @Json(name = "ZN") val zN: ZN,
                    @Json(name = "P") val p: P,
                    @Json(name = "VITA_RAE") val vITARAE: VITARAE,
                    @Json(name = "VITC") val vITC: VITC,
                    @Json(name = "THIA") val tHIA: THIA,
                    @Json(name = "RIBF") val rIBF: RIBF,
                    @Json(name = "NIA") val nIA: NIA,
                    @Json(name = "VITB6A") val vITB6A: VITB6A,
                    @Json(name = "FOLDFE") val fOLDFE: FOLDFE,
                    @Json(name = "VITB12") val vITB12: VITB12,
                    @Json(name = "VITD") val vITD: VITD,
                    @Json(name = "TOCPHA") val tOCPHA: TOCPHA,
                    @Json(name = "VITK1") val vITK1: VITK1
            ) {

                data class CHOCDF(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class VITB6A(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class PROCNT(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class FOLDFE(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class FASAT(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class TOCPHA(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class P(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class CA(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class FE(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class MG(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class K(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class CHOLE(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class VITARAE(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class ENERCKCAL(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class NIA(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class VITB12(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class NA(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class FIBTG(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class THIA(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class VITK1(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class FAT(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class ZN(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class RIBF(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class VITD(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )


                data class VITC(
                        @Json(name = "label") val label: String,
                        @Json(name = "quantity") val quantity: Double,
                        @Json(name = "unit") val unit: String
                )
            }
        }
    }


    data class Params(
            @Json(name = "sane") val sane: List<Any>,
            @Json(name = "q") val q: List<String>,
            @Json(name = "app_key") val appKey: List<String>,
            @Json(name = "health") val health: List<String>,
            @Json(name = "from") val from: List<String>,
            @Json(name = "to") val to: List<String>,
            @Json(name = "calories") val calories: List<String>,
            @Json(name = "app_id") val appId: List<String>
    )
}