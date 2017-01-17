package edu.holycross.shot.nysi

import edu.harvard.chs.cite.CtsUrn

import au.com.bytecode.opencsv.CSVReader

import static org.junit.Assert.*
import org.junit.Test

class TestImageCollectionCite2 extends GroovyTestCase {


  String expectedUrnStr = "urn:cite2:fufolioimg:BotCarCatesbyHS.v1:"
  String expectedLabel =  "Images of Mark Catesby's botanical specimens from the Sloane Herbarium."
  String expectedPath = "/project/homer/Sloane/pyramids"
  String expectedCaptionProp = "BotCarCatesbyHS_caption"
String expectedRightsProp =   "BotCarCatesbyHS_rights"
  ArrayList config = [
    expectedUrnStr,
    expectedLabel,
    expectedPath,
    expectedCaptionProp,
    expectedRightsProp
  ]

   @Test void testConstructor() {
     ImageCollection ic = new ImageCollection(config)
     assert ic


     assert ic.getUrn().toString() == expectedUrnStr
     assert ic.getLabel()  == expectedLabel
     assert ic.getPath() == expectedPath
     assert ic.getCaptionProperty() == expectedCaptionProp
     assert ic.getRightsProperty() == expectedRightsProp

     assert shouldFail {
       ImageCollection emptyArray = new ImageCollection([])
     }
   }
}