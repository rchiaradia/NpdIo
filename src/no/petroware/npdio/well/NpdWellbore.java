package no.petroware.npdio.well;

import java.util.Date;

import no.petroware.npdio.NpdObject;

/**
 * Common part of all wellbores as modeled by the NPD.
 * Act as base class for the specific wellbore types.
 *
 * @author <a href="mailto:info@petroware.no">Petroware AS</a>
 */
public class NpdWellbore extends NpdObject
{
  private final String wellName_;
  private final String drillingOperator_;
  private final String productionLicense_;
  private final String status_;
  private final String purpose_;
  private final String purposePlanned_;
  private final String content_;
  private final String wellType_;
  private final Boolean isSubsea_;
  private final Date entryDate_;
  private final Date completionDate_;
  private final String field_;
  private final String drillPermit_;
  private final String discovery_;
  private final Boolean isDiscoveryWellbore_;
  private final Double kellyBushElevation_;
  private final Double finalVerticalDepth_;
  private final Double totalDepth_;
  private final Double waterDepth_;
  private final Double kickOffPoint_;
  private final String mainArea_;
  private final String drillingFacility_;
  private final String drillingFacilityType_;
  private final String drillingFacilityCategory_;
  private final String licensingActivity_;
  private final Boolean isMultilateral_;
  private final Integer entryYear_;
  private final Integer completionYear_;
  private final String reclassFromWellbore_;
  private final Integer plotSymbol_;
  private final String geodeticDatum_;
  private final Integer nsDeg_;
  private final Integer nsMin_;
  private final Double nsSec_;
  private final String nsCode_;
  private final Integer ewDeg_;
  private final Integer ewMin_;
  private final Double ewSec_;
  private final String ewCode_;
  private final Double latitude_; // NsDecDeg
  private final Double longitude_; // EwDecDeg
  private final Double nsUtm_;
  private final Double ewUtm_;
  private final Integer utmZone_;
  private final Integer namePart1_; // quadrant
  private final Integer namePart2_; // block
  private final String namePart3_; // installation
  private final Integer namePart4_; // installation
  private final String namePart5_;
  private final String namePart6_;
  private final String diskosWellboreType_;
  private final String diskosWellboreParent_;
  private final String npdidDiscovery_;
  private final String npdidField_;
  private final Date wdssQcDate_;
  private final Date releaseDate_;
  private final String npdidProductionLicense_;
  private final String npdidFacilityDrilling_;
  private final String npdidWellboreReclass_;

  NpdWellbore(String type,
              String npdId,
              String name,
              String wellName,
              String drillingOperator,
              String productionLicense,
              String status,
              String purpose,
              String purposePlanned,
              String content,
              String wellType,
              Boolean isSubsea,
              Date entryDate,
              Date completionDate,
              String field,
              String drillPermit,
              String discovery,
              Boolean isDiscoveryWellbore,
              Double kellyBushElevation,
              Double finalVerticalDepth,
              Double totalDepth,
              Double waterDepth,
              Double kickOffPoint,
              String mainArea,
              String drillingFacility,
              String drillingFacilityType,
              String drillingFacilityCategory,
              String licensingActivity,
              Boolean isMultilateral,
              Integer entryYear,
              Integer completionYear,
              String reclassFromWellbore,
              Integer plotSymbol,
              String geodeticDatum,
              Integer nsDeg,
              Integer nsMin,
              Double nsSec,
              String nsCode,
              Integer ewDeg,
              Integer ewMin,
              Double ewSec,
              String ewCode,
              Double latitude, // NsDecDeg
              Double longitude, // EwDecDeg
              Double nsUtm,
              Double ewUtm,
              Integer utmZone,
              Integer namePart1, // quadrant
              Integer namePart2, // block
              String namePart3, // installation
              Integer namePart4, // installation
              String namePart5,
              String namePart6,
              String factPageUrl,
              String factMapUrl,
              String diskosWellboreType,
              String diskosWellboreParent,
              String npdidDiscovery,
              String npdidField,
              Date wdssQcDate,
              Date releaseDate,
              String npdidProductionLicense,
              String npdidFacilityDrilling,
              String npdidWellboreReclass,
              Date syncDate)
  {
    super(type, npdId, name, factPageUrl, factMapUrl, null, syncDate);

    wellName_ = wellName;
    drillingOperator_ = drillingOperator;
    productionLicense_ = productionLicense;
    status_ = status;
    purpose_ = purpose;
    purposePlanned_ = purposePlanned;
    content_ = content;
    wellType_ = wellType;
    isSubsea_ = isSubsea;
    entryDate_ = entryDate;
    completionDate_ = completionDate;
    field_ = field;
    drillPermit_ = drillPermit;
    discovery_ = discovery;
    isDiscoveryWellbore_ = isDiscoveryWellbore;
    kellyBushElevation_ = kellyBushElevation;
    finalVerticalDepth_ = finalVerticalDepth;
    totalDepth_ = totalDepth;
    waterDepth_ = waterDepth;
    kickOffPoint_ = kickOffPoint;
    mainArea_ = mainArea;
    drillingFacility_ = drillingFacility;
    drillingFacilityType_ = drillingFacilityType;
    drillingFacilityCategory_ = drillingFacilityCategory;
    licensingActivity_ = licensingActivity;
    isMultilateral_ = isMultilateral;
    entryYear_ = entryYear;
    completionYear_ = completionYear;
    reclassFromWellbore_ = reclassFromWellbore;
    plotSymbol_ = plotSymbol;
    geodeticDatum_ = geodeticDatum;
    nsDeg_ = nsDeg;
    nsMin_ = nsMin;
    nsSec_ = nsSec;
    nsCode_ = nsCode;
    ewDeg_ = ewDeg;
    ewMin_ = ewMin;
    ewSec_ = ewSec;
    ewCode_ = ewCode;
    latitude_ = latitude;
    longitude_ = longitude;
    nsUtm_ = nsUtm;
    ewUtm_ = ewUtm;
    utmZone_ = utmZone;
    namePart1_ = namePart1;
    namePart2_ = namePart2;
    namePart3_ = namePart3;
    namePart4_ = namePart4;
    namePart5_ = namePart5;
    namePart6_ = namePart6;
    diskosWellboreType_ = diskosWellboreType;
    diskosWellboreParent_ = diskosWellboreParent;
    npdidDiscovery_ = npdidDiscovery;
    npdidField_ = npdidField;
    wdssQcDate_ = wdssQcDate;
    releaseDate_ = releaseDate;
    npdidProductionLicense_ = npdidProductionLicense;
    npdidFacilityDrilling_ = npdidFacilityDrilling;
    npdidWellboreReclass_ = npdidWellboreReclass;
  }

  /**
   * Return name of parent well of this wellbore.
   * <p>
   * Official name of the parent well for the wellbore based on NPD guidelines for
   * designation of wells and wellbores.
   * <p>
   * varchar(40), corresponds to NPD property <em>wlbWell</em>.
   *
   * @return  Name of parent well of this wellbore.
   */
  public String getWellName()
  {
    return wellName_;
  }

  /**
   * Return drilling operator of this wellbore.
   * <p>
   * Name of the company reponsible for drilling the wellbore.
   * <p>
   * varchar(60), corresponds to NPD property <em>wlbDrillingOperator</em>.
   *
   * @return  Drilling operator of this wellbore.
   */
  public String getDrillingOperator()
  {
    return drillingOperator_;
  }

  /**
   * Get production license of this wellbore.
   * <p>
   * Official designation of the production licence the wellbore was drilled in.
   * <p>
   * varchar(40), corresponds to the NPD property <em>wlbProductionLicence</em>.
   *
   * @return  Production license of this wellbore.
   */
  public String getProductionLicense()
  {
    return productionLicense_;
  }

  /**
   * Get status of this wellbore.
   * <p>
   * Legal values includes:
   * <ul>
   *   <li>BLOWOUT (a blowout has occurred in the well)</li>
   *   <li>CLOSED (a development well that has been closed in a shorter or longer period)</li>
   *   <li>DRILLING (the well is in the drilling phase - can be active drilling, logging, testing or plugging)</li>
   *   <li>JUNKED (the well is finished because of technical problems)</li>
   *   <li>ONLINE/OPERATIONAL (development well that is drilled - is either ready for production or is currently producing or injecting)</li>
   *   <li>P&amp;A (exploration: the well is plugged and abandoned, development: the production/ injection in the well is stopped and the field is closed)</li>
   *   <li>PLUGGED (the development well is plugged, but the field is still active)</li>
   *   <li>PREDRILLED (predrilling of the well is done)</li>
   *   <li>RE-CLASS TO DEV (exploration well that is reclassified to a development well)</li>
   *   <li>RE-CLASS TO TEST (exploration well that is reclassified to test production)</li>
   *   <li>SUSPENDED (well that is temporary abandoned)</li>
   * </ul>
   * <p>
   * varchar(40), corresponds to the NPD property <em>wlbStatus</em>.
   *
   * @return  Status of this wellbore.
   */
  public String getStatus()
  {
    return status_;
  }

  /**
   * Return purpose of this wellbore.
   * <p>
   * Final classification of the wellbore.
   * <p>
   * Legal values for exploration wellbores:
   * <ul>
   *   <li>WILDCAT</li>
   *   <li>APPRAISAL</li>
   * </ul>
   *
   * Legal values for development wellbores:
   * <ul>
   *   <li>OBSERVATION</li>
   *   <li>PRODUCTION</li>
   *   <li>INJECTION</li>
   * </ul>
   *
   * Legal values for other wellbores:
   * <ul>
   *   <li>SOIL DRILLING (drilling in connection with track surveys and other subsurface surveys to investigate the soil conditions prior to placement of facilities)</li>
   *   <li>SHALLOW GAS (drilling to investigate shallow gas before the first 'real' drilling on the location)</li>
   *   <li>PILOT (drilling to investigate the geology and fluid connectors for location of the main wellbore)</li>
   *   <li>SCIENTIFIC (drilling according to Law of Scientific research and exploration)</li>
   *   <li>STRATIGRAPHIC (drilling according to Law of Petroleum activities §2-1)</li>
   * </ul>
   * <p>
   * varchar(40), corresponds to the NPD property <em>wlbPurpose</em>.
   *
   * @return  Purpose of this wellbore.
   */
  public String getPurpose()
  {
    return purpose_;
  }

  /**
   * Retur the planned purpose of this wellbore.
   * <p>
   * Pre-drill purpose of the wellbore.
   * <p>
   * Legal values for exploration wellbores:
   * <ul>
   *   <li>WILDCAT</li>
   *   <li>APPRAISAL</li>
   * </ul>
   *
   * Example of legal values for development wellbores:
   * <ul>
   *   <li>OBSERVATION</li>
   *   <li>NOT AVAILABLE</li>
   *   <li>PRODUCTION</li>
   *   <li>INJECTION</li>
   * </ul>
   * <p>
   * varchar(40), corresponds to the NPD property <em>wlbPurposePlanned</em>.
   *
   * @return  Planned purpose of this wellbore.
   */
  public String getPurposePlanned()
  {
    return purposePlanned_;
  }

  /**
   * Return content of this wellbore.
   * <p>
   * For exploration wellbores, status of discovery.
   * <p>
   * Legal values:
   * <ul>
   *   <li>DRY</li>
   *   <li>SHOWS (trace amounts of hydrocarbons)</li>
   *   <li>GAS</li>
   *   <li>GAS/CONDENSATE</li>
   *   <li>OIL</li>
   *   <li>OIL/GAS</li>
   * </ul>
   * <p>
   * SHOWS (GAS SHOWS, OIL SHOWS or OIL/GAS SHOWS) are detected as
   * fluorescent cut (organic extract), petroleum odour, or visual stain on
   * cuttings or cores, or as increased gas reading on the mud-loggers gas
   * detection equipment.
   * <p>
   * For development wellbores, type of produced/injected fluid.
   * <p>
   * Legal values:
   * <ul>
   *   <li>WATER</li>
   *   <li>CUTTINGS</li>
   *   <li>NOT AVAILABLE</li>
   *   <li>OIL</li>
   *   <li>GAS/CONDENSATE</li>
   *   <li>OIL/GAS</li>
   *   <li>CO2</li>
   *   <li>GAS</li>
   *   <li>WATER/GAS</li>
   *   <li>NOT APPLICABLE</li>
   * </ul>
   * varchar(40), corresponds to the NPD property <em>wlbContent</em>.
   *
   * @return  Content of this wellbore.
   */
  public String getContent()
  {
    return content_;
  }

  /**
   * Return type of this wellbore.
   * <p>
   * Legal values:
   * <ul>
   *   <li>EXPLORATION</li>
   *   <li>DEVELOPMENT</li>
   *   <li>OTHER (see 'Purpose' for more information)</li>
   * </ul>
   * <p>
   * varchar(20), corresponds to the NPD property <em>wlbWellType</em>.
   *
   * @return  Type of this wellbore.
   */
  public String getWellType()
  {
    return wellType_;
  }

  /**
   * Indicates if the well is completed on the seabed.
   *
   * @return  True if the well is completed on the seabed, false otherwise.
   *          Null if the feature is not specified.
   */
  public Boolean isSubsea()
  {
    return isSubsea_;
  }

  /**
   * Return entry date of this wellbore.
   * <p>
   * The date when the drill bit penetrated the earth's crust / sea floor.
   * <p>
   * datetime, corresponds to the NPD property <em>wlbEntryDate</em>.
   *
   * @return  Entry date of this wellbore.
   */
  public Date getEntryDate()
  {
    return entryDate_ != null ? new Date(entryDate_.getTime()) : null;
  }

  /**
   * Return completion date of this wellbore.
   * <p>
   * Exploration wellbores from moveable facilities:
   * <p>
   *   For floating facilities - date when anchor handling is started.<br>
   *   For jackups - date the jacking-down started.
   *
   * <p>
   * Exploration wellbores from fixed facilities and all development wellbores:
   * <p>
   * Date when the wellbore is at total depth, and last casing or liner is set.
   * <p>
   * datetime, corresponds to the NPD property <em>wlbCompletionDate</em>.
   *
   * @return  Completion date of this wellbore.
   */
  public Date getCompletionDate()
  {
    return completionDate_ != null ? new Date(completionDate_.getTime()) : null;
  }

  /**
   * Field of this wellbore.
   * <p>
   * Name of the field the wellbore is related to.
   * <p>
   * varchar(40), corresponds to the NPD property <em>wlbField</em>.
   *
   * @return  Field of this wellbore.
   */
  public String getField()
  {
    return field_;
  }

  /**
   * Return drill permit of this wellbore.
   * <p>
   * The drilling permit number together with the version of the drilling
   * permit as stated in the drilling permit granted by the NPD.
   * <p>
   * varchar(10), corresponds to the NPD property <em>wlbDrillPermit</em>.
   *
   * @return  Drill permit of this wellbore.
   */
  public String getDrillPermit()
  {
    return drillPermit_;
  }

  /**
   * Return discovery of this wellbore.
   * <p>
   * Name of the discovery the wellbore is related to.
   * <p>
   * varchar(40), corresponds to the NPD property <em>wlbDiscovery</em>.
   *
   * @return  Discovery of this wellbore.
   */
  public String getDiscovery()
  {
    return discovery_;
  }

  /**
   * Return if this is a discovery wellbore.
   * <p>
   * Indicator which telles if the wellbore made a new discovery.
   * <p>
   * varchar(3), corresponds to the NPD property <em>wlbDiscoveryWellbore</em>.
   *
   * @return  True if this is a discovery wellbore, false otherwise.
   */
  public Boolean isDiscoveryWellbore()
  {
    return isDiscoveryWellbore_;
  }

  /**
   * Kelly bushing elevation of this wellbore.
   * <p>
   * Elevation of the rotary kelly bushing (RKB) above mean sea level.
   * <p>
   * numeric, corresponds to the NPD property <em>wlbKellyBushElevation</em>.
   *
   * @return  Kelly bushing elevation of this wellbore in meters.
   */
  public Double getKellyBushElevation()
  {
    return kellyBushElevation_;
  }

  /**
   * Return final vertical depth of this wellbore.
   * <p>
   * Vertical elevation from total depth to kelly bushing.
   * Often referred to as true vertical depth (TVD).
   * <p>
   * real, corresponds to the NPD property <em>wlbFinalVerticalDepth</em>.
   *
   * @return  Final vertical depth of this wellbore in meters.
   */
  public Double getFinalVerticalDepth()
  {
    return finalVerticalDepth_;
  }

  /**
   * Return totl depth of this wellbore.
   * <p>
   * Total measured length of wellbore from kelly bushing to
   * total depth (driller's depth).
   * <p>
   * numeric, corresponds to the NPD property <em>wlbTotalDepth</em>.
   *
   * @return  Total depth of this wellbore in meters.
   */
  public Double getTotalDepth()
  {
    return totalDepth_;
  }

  /**
   * Return weater depth of this wellbore.
   * <p>
   * Depth in metres betweem mean sea level and sea floor.
   * <p>
   * numeric, corresponds to the NPD property <em>wlbWaterDepth</em>.
   *
   * @return  Water depth of this wellbore in meters.
   */
  public Double getWaterDepth()
  {
    return waterDepth_;
  }

  /**
   * Depth the wellbore originates from within the original wellbore.
   *
   * @return  Depth the wellbore originates from within the original wellbore.
   */
  public Double getKickOffPoint()
  {
    return kickOffPoint_;
  }

  /**
   * Return main area of this wellbore.
   * <p>
   * Name of the area on the Norwegian Continental Shelf where the wellbore is located.
   * <p>
   * Legal values:
   * <ul>
   *   <li>BARENTS SEA</li>
   *   <li>NORWEGIAN SEA</li>
   *   <li>NORTH SEA</li>
   * </ul>
   * <p>
   * varchar(40), corresponds to the NPD property <em>wlbMainArea</em>.
   *
   * @return  Main area of this wellbore.
   */
  public String getMainArea()
  {
    return mainArea_;
  }

  /**
   * Drilling facility of this wellbore.
   * <p>
   * NPD's name of the facility which the wellbore was drilled from.
   * <p>
   * varchar(50), corresponds to the NPD property <em>wlbDrillingFacility</em>.
   *
   * @return  Drilling facility of this wellbore.
   */
  public String getDrillingFacility()
  {
    return drillingFacility_;
  }

  /**
   * Return drilling facility type of this wellbore.
   * <p>
   * Kind of drilling facility.
   * <p>
   * Example of legal values:
   * <ul>
   *   <li>CONCRETE STRUCTURE</li>
   *   <li>CONDEEP 3 SHAFTS</li>
   *   <li>CONDEEP 4 SHAFTS</li>
   *   <li>CONDEEP MONOSHAFT</li>
   *   <li>JACKET 12 LEGS</li>
   *   <li>JACKET 4 LEGS</li>
   *   <li>JACKET 6 LEGS</li>
   *   <li>JACKET 8 LEGS</li>
   *   <li>JACK-UP 3 LEGS</li>
   *   <li>JACK-UP 4 LEGS</li>
   *   <li>SEMISUB STEEL</li>
   *   <li>TLP CONCRETE</li>
   *   <li>TLP STEEL</li>
   *   <li>VESSEL</li>
   * </ul>
   * <p>
   * varchar(40), corresponds to the NPD property <em>wlbFacilityTypeDrilling</em>.
   *
   * @return  Kind of drilling facility of this wellbore.
   */
  public String getDrillingFacilityType()
  {
    return drillingFacilityType_;
  }

  /**
   * Return drilling facility type of this wellbore.
   * <p>
   * Indicates if a moveable or fixed facility drilled the well.
   * <p>
   * Legal values;
   * <ul>
   *   <li>FIXED</li>
   *   <li>MOVEABLE</li>
   * </ul>
   * <p>
   * varchar(10), corresponds to the NPD property <em>wlbDrillingFacilityFixedOrMoveable</em>.
   *
   * @return  Drilling facility category of this wellbore.
   */
  public String getDrillingFacilityCategory()
  {
    return drillingFacilityCategory_;
  }

  /**
   * Return license activity of this wellbore.
   * <p>
   * Name of the licensing activity the production licence
   * the wellbore was drilled in, was awarded in.
   * <p>
   * varchar(40), corresponds to the NPD property <em>wlbLicensingActivity</em>.
   *
   * @return  License activity of this wellbore.
   */
  public String getLicensingActivity()
  {
    return licensingActivity_;
  }

  /**
   * Return if this wellbore is multilateral.
   * <p>
   * Indicator telling if the parent well is multilateral,
   * meaning it has more than one branch radiating from the main borehole.
   * See also NPD guidelines for designation of wells and wellbores.
   * <p>
   * varchar(3), corresponds to the NPD property <em>wlbMultilateral</em>.
   *
   * @return  True if this wellbore is multilateral, false otherwise.
   */
  public Boolean isMultilateral()
  {
    return isMultilateral_;
  }

  /**
   * Get entry year of this wellbore.
   * <p>
   * The year when the drill bit penetrated the earth's crust / sea floor.
   * <p>
   * int, corresponds to the NPD property <em>wlbEntryYear</em>.
   *
   * @return  Entry year of this wellbore.
   */
  public Integer getEntryYear()
  {
    return entryYear_;
  }

  /**
   * Return completion year of this wellbore.
   * <p>
   * The year when the anchor handling started.
   * In case of jack-ups: the year the jacking-down started.
   * <p>
   * int, corresponds to the NPD property <em>wlbCompletionYear</em>.
   *
   * @return  Completion year of this wellbore.
   */
  public Integer getCompletionYear()
  {
    return completionYear_;
  }

  /**
   * Original wellbore of this wellbore.
   * <p>
   * The original wellbore that this wellbore is reclassified from.
   * A wellbore can only be reclassified from exploration to development,
   * not the other way.
   * <p>
   * varchar(40), corresponds to the NPD property <em>wlbReclassFromWellbore</em>.
   *
   * @return  Original wellbore of this wellbore.
   */
  public String getReclassFromWellbore()
  {
    return reclassFromWellbore_;
  }

  /**
   * Plot symbol of this wellbore.
   * <p>
   * NPD's plot symbol number for wellbores.
   * <p>
   * int, corresponds to the NPD property <em>wlbPlotSymbol</em>.
   *
   * @return  Plot symbol of this wellbore.
   */
  public Integer getPlotSymbol()
  {
    return plotSymbol_;
  }

  /**
   * Return geodetic datum of this wellbore.
   * <p>
   * Reference system for coordinates. Example of legal values: ED50.
   * <p>
   * varchar(6), corresponds to the NPD property <em>wlbGeodeticDatum</em>.
   *
   * @return  Geodetic datum of this wellbore.
   */
  public String getGeodeticDatum()
  {
    return geodeticDatum_;
  }

  /**
   * Return NS degrees position of this wellbore.
   * <p>
   * Geographic coordinate of the wellhead, north-south degrees.
   * <p>
   * int, corresponds to the NPD property <em>wlbNsDeg</em>.
   *
   * @return  NS degrees position of this wellbore.
   */
  public Integer getNsDeg()
  {
    return nsDeg_;
  }

  /**
   * Return NS minutes position of this wellbore.
   * <p>
   * Geographic coordinate of the wellhead, north-south minutes.
   * <p>
   * int, corresponds to the NPD property <em>wlbNsMin</em>.
   *
   * @return  NS minutes position of this wellbore.
   */
  public Integer getNsMin()
  {
    return nsMin_;
  }

  /**
   * Return NS seconds position of this wellbore.
   * <p>
   * Geographic coordinate of the wellhead, north-south seconds (decimal number).
   * <p>
   * real, corresponds to the NPD property <em>wlbNsSec</em>.
   *
   * @return  NS seconds position of this wellbore.
   */
  public Double getNsSec()
  {
    return nsSec_;
  }

  /**
   * Return NS position code of this wellbore.
   * <p>
   * Indicator whcih tells if the coordinate of the wellhead is on the
   * nothern or southern hemisphere. Legal values: N, S.
   * <p>
   * varchar(1), corresponds to the NPD property <em>wlbNsCode</em>.
   *
   * @return  NS position code of this wellbore.
   */
  public String getNsCode()
  {
    return nsCode_;
  }

  /**
   * Return EW degrees position of this wellbore.
   * <p>
   * Geographic coordinate of the wellhead, east-west degrees.
   * <p>
   * int, corresponds to the NPD property <em>wlbEwDeg</em>.
   *
   * @return  EW degrees position of this wellbore.
   */
  public Integer getEwDeg()
  {
    return ewDeg_;
  }

  /**
   * Return EW minutes position of this wellbore.
   * <p>
   * Geographic coordinate of the wellhead, east-west minutes.
   * <p>
   * int, corresponds to the NPD property <em>wlbEwMin</em>.
   *
   * @return  EW minutes position of this wellbore.
   */
  public Integer getEwMin()
  {
    return ewMin_;
  }

  /**
   * Return EW seconds position of this wellbore.
   * <p>
   * Geographic coordinate of the wellhead, east-west seconds (decimal number).
   * <p>
   * real, corresponds to the NPD property <em>wlbEwSec</em>.
   *
   * @return  EW seconds position of this wellbore.
   */
  public Double getEwSec()
  {
    return ewSec_;
  }

  /**
   * Return EW position code of this wellbore.
   * <p>
   * Indicator whcih tells if the coordinate of the wellhead is on the
   * nothern or southern hemisphere. Legal values: W, W.
   * <p>
   * varchar(1), corresponds to the NPD property <em>wlbEwCode</em>.
   *
   * @return  EW position code of this wellbore.
   */
  public String getEwCode()
  {
    return ewCode_;
  }

  /**
   * Return complete UTM position of wellhead of this wellbore.
   *
   * @return  Complete UTM position of this wellbore.
   */
  public String getUtmPosition()
  {
    StringBuilder s = new StringBuilder();
    s.append(nsDeg_);
    s.append("\u00b0");
    s.append(nsMin_);
    s.append("'");
    s.append(nsSec_);
    s.append("\"");
    s.append(nsCode_);
    s.append(" ");
    s.append(ewDeg_);
    s.append("\u00b0");
    s.append(ewMin_);
    s.append("'");
    s.append(ewSec_);
    s.append("\"");
    s.append(ewCode_);

    return s.toString();
  }

  /**
   * Return latitude of this wellbore.
   * <p>
   * Geographic coordinate of the wellhead, north-south, decimal degrees.
   * <p>
   * decimal, corresponds to the NPD property <em>wlbNsDecDeg</em>.
   *
   * @return  Latitude of this wellbore.
   */
  public Double getLatitude()
  {
    return latitude_;
  }

  /**
   * Return longitude of this wellbore.
   * <p>
   * Geographic coordinate of the wellhead, east-west, decimal degrees.
   * <p>
   * decimal, corresponds to the NPD property <em>wlbEwDesDeg</em>.
   *
   * @return  Longitude of this wellbore.
   */
  public Double getLongitude()
  {
    return longitude_;
  }

  /**
   * Return NS UTM position of this wellbore.
   * <p>
   * Universal Transverse Mercator coordinate of the wellhead, north-south.
   * <p>
   * decimal, corresponds to the NPD property <em>wlbNsUtm</em>.
   *
   * @return  NS UTM position of this wellbore in meters.
   */
  public Double getNsUtm()
  {
    return nsUtm_;
  }

  /**
   * Return EW UTM position of this wellbore.
   * <p>
   * Universal Transverse Mercator coordinate of the wellhead, east-west.
   * <p>
   * decimal, corresponds to the NPD property <em>wlbEwUtm</em>.
   *
   * @return  EW UTM position of this wellbore in meters.
   */
  public Double getEwUtm()
  {
    return ewUtm_;
  }

  /**
   * Return UTM zone of this wellbore.
   * <p>
   * Universal Transverse Mercator zone. Examples of legal values: 31, 32, 33, 34.
   * <p>
   * int, corresponds to the NPD property <em>wlbUtmZone</em>.
   *
   * @return  UTM zone of this wellbore.
   */
  public Integer getUtmZone()
  {
    return utmZone_;
  }

  /**
   * Return part 1 of name of this wellbore.
   * <p>
   * Part 1 of the wellbore name. Tells quadrant number on the
   * Norwegian Continental Shelf the wellbore was drilled in.
   * Based on NPD guidelines for designation of wells and wellbores.
   * <p>
   * int, corresponds to the NPD property <em>wlbNamePart1</em>.
   *
   * @return  Part 1 of name of this wellbore.
   */
  public Integer getNamePart1()
  {
    return namePart1_;
  }

  /**
   * Return part 2 of name of this wellbore.
   * <p>
   * Part 2 of the wellbore name. Tells the block number the
   * wellbore was drilled in.
   * Based on NPD guidelines for designation of wells and wellbores.
   * <p>
   * int, corresponds to the NPD property <em>wlbNamePart2</em>.
   *
   * @return  Part 2 of name of this wellbore.
   */
  public Integer getNamePart2()
  {
    return namePart2_;
  }

  /**
   * Return part 3 of name of this wellbore.
   * <p>
   * Part 3 of the wellbore name. Tells the name of the installation the
   * wellbore was drilled from. Not used for exploration wellbores.
   * Based on NPD guidelines for designation of wells and wellbores.
   * <p>
   * varchar(1), corresponds to the NPD property <em>wlbNamePart3</em>.
   *
   * @return  Part 3 of name of this wellbore.
   */
  public String getNamePart3()
  {
    return namePart3_;
  }

  /**
   * Return part 4 of name of this wellbore.
   * <p>
   * Part 4 of the wellbore name. Serial number for the wellbore.
   * Based on NPD guidelines for designation of wells and wellbores.
   * <p>
   * int, corresponds to the NPD property <em>wlbNamePart4</em>.
   *
   * @return  Part 4 of name of this wellbore.
   */
  public Integer getNamePart4()
  {
    return namePart4_;
  }

  /**
   * Return part 5 of name of this wellbore.
   * <p>
   * Part 5 of the wellbore name. Used to indicate exploration wells planned
   * deviated (S), sidetracks (A, B,...), re-entries (R) or planned multilaterals (Y).
   * Based on NPD guidelines for designation of wells and wellbores.
   * <p>
   * varchar(2), corresponds to the NPD property <em>wlbNamePart5</em>.
   *
   * @return  Part 5 of name of this wellbore.
   */
  public String getNamePart5()
  {
    return namePart5_;
  }

  /**
   * Return part 6 of name of this wellbore.
   * <p>
   * Part 6 of the wellbore name. Serial number of re-entries or serial number of the
   * well tracks in multilatrals.
   * Based on NPD guidelines for designation of wells and wellbores.
   * <p>
   * varchar(2), corresponds to the NPD property <em>wlbNamePart6</em>.
   *
   * @return  Part 6 of name of this wellbore.
   */
  public String getNamePart6()
  {
    return namePart6_;
  }

  /**
   * DISKOS type of this wellbore.
   * <p>
   * Wellbore type - applicable for DISKOS.
   * <p>
   * varchar(20), corresponds to the NPD property <em>wlbDiskosWellboreType</em>.
   *
   * @return  DISKOS type of this wellbore.
   */
  public String getDiskosWellboreType()
  {
    return diskosWellboreType_;
  }

  /**
   * DISKOS parent of this wellbore.
   * <p>
   * Wellbore parent - applicable for DISKOS.
   * <p>
   * varchar(40), corresponds to the NPD property <em>wlbDiskosWellboreParent</em>.
   *
   * @return  DISKOS parent of this wellbore.
   */
  public String getDiskosWellboreParent()
  {
    return diskosWellboreParent_;
  }

  /**
   * Return ID of the discovery of this wellbore.
   * <p>
   * NPD's unique id for the discovery.
   * <p>
   * bigint, corresponds to the NPD property <em>dscNpdidDiscovery</em>.
   *
   * @return  ID of the discovery of this wellbore.
   */
  public String getNpdidDiscovery()
  {
    return npdidDiscovery_;
  }

  /**
   * Return ID of the field of this wellbore.
   * <p>
   * NPD's unique id for the field.
   * <p>
   * bigint, corresponds to the NPD property <em>fldNpdidField</em>.
   *
   * @return  ID of the field of this wellbore.
   */
  public String getNpdidField()
  {
    return npdidField_;
  }

  /**
   * Return QC date of this wellbore.
   * <p>
   * Date quality control of the wellbore information was completed,
   * so it can be published on the internet as a 'Well Data Summary Sheet'
   * wellbore with more information available than other wellbores.
   * <p>
   * datetime, corresponds to the NPD property <em>wlbWdssQcDate</em>.
   *
   * @return  QC date of this wellbore.
   */
  public Date getWdssQcDate()
  {
    return wdssQcDate_ != null ? new Date(wdssQcDate_.getTime()) : null;
  }

  /**
   * Return release date of this wellbore.
   * <p>
   * Date when raw data which has been reported to the authorities from the
   * wellbore is not confidential any longer. Normally 2 years after finishing
   * the drilling. May be earlier if the area of the production license is
   * relinquished.
   *
   * @return  Release date of this wellbore.
   */
  public Date getReleaseDate()
  {
    return releaseDate_ != null ? new Date(releaseDate_.getTime()) : null;
  }

  /**
   * Return ID of the production license of this wellbore.
   * <p>
   * NPD's unique id for the production licence the wellbore was drilled in.
   * <p>
   * bigint, corresponds to the NPD property <em>prlNpdidProductionLicence</em>.
   *
   * @return  ID of the production license of this wellbore.
   */
  public String getNpdidProductionLicense()
  {
    return npdidProductionLicense_;
  }

  /**
   * Return ID of the drilling facility of this wellbore.
   * <p>
   * NPD's unique id for the facility that has drilled the wellbore.
   * <p>
   * bigint, corresponds to the NPD property <em>fclNpdidFacilityDrilling</em>.
   *
   * @return  ID of the drilling facility of this wellbore.
   */
  public String getNpdidFacilityDrilling()
  {
    return npdidFacilityDrilling_;
  }

  /**
   * Return ID of the original wellbore.
   * <p>
   * NPD's unique id for the wellbore this wellbore was reclassified from.
   * <p>
   * bigint, corresponds to the NPD property <em>wlbNpdidWellboreReclass</em>.
   *
   * @return  ID of original wellbore.
   */
  public String getNpdidWellboreReclass()
  {
    return npdidWellboreReclass_;
  }
}
