package org.agoncal.application.cdbookstore.util;

import javax.inject.Inject;

import org.apache.logging.log4j.Logger;

@ThirteenDigits
public class IsbnGenerator
{

   @Inject
   private Logger logger;
   @Inject
   @ThirteenDigits
   private String prefix;
   @Inject
   @ThirteenDigits
   private int postfix;

   public String generateNumber()
   {
      throw new UnsupportedOperationException("Not supported yet.");
   }
}