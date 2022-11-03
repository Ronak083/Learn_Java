<?php

class CarPriceEstimator

{

    function __construct(){

    }

    public static function CarPriceEstimator()

    {

        $local_this = new CarPriceEstimator();

        return $local_this;

    }

    public function getSalePrice($makeAndModel, $yearManufactured, $milesDriven, $airBagsCount, $hasAbs, $hasEbd, $hasRearViewCamera, $hasSunRoof, $hasAutoAC, $hasAccidentHistory)

    {

        $salePrice = $this->getPrice($makeAndModel, $yearManufactured);

        $currentYear = LocalDate.now().getYear();

        $ageOfCar = $currentYear - $yearManufactured + 1;

        echo "ageOfCar: " . strval($ageOfCar),"\n";

        // 1. Compute based on yearly depreciation value:

        //       if age of car is less than or equal to 10 then

        //               price depreciates by 5% of original sale price every year

        //               e.g., if original price is 10000, then for 3 year old car

        //                     price depreciated would be 1500, i.e., sale price would be 8500

        //       else

        //               return salePrice * 0.1 (i.e., 10% of current salePrice)

        // Note: Use compound arithmetic assignment operators

        if ($ageOfCar <= 10)

        {

            $n = 5 * $salePrice / 100;

            $salePrice = $salePrice - ($ageOfCar * $n);

        }

        else 

        {

            $salePrice = $salePrice * 0.1;

        }

        echo "salePrice after depreciation: " . strval($salePrice),"\n";

        // 2. Security Features

        //      if car does NOT have atleast two airbags AND abs AND ebd

        //              then reduce price by $1000

        if ($airBagsCount < 2 || $hasAbs == false || $hasEbd == false)

        {

            $salePrice -= 1000;

        }

        echo "salePrice after accounting for security features: " . strval($salePrice),"\n";

        // 3. Comfort Features

        // if car has rear-view camera AND either sunroof OR auto AC then

        //    increment price by $500

        if ($hasRearViewCamera && $hasSunRoof || $hasAutoAC)

        {

            $salePrice += 500;

        }

        echo "salePrice after accounting for comfort features: " . strval($salePrice),"\n";

        // 4. Past accidents

        // if car was involved in an accident then

        //     reduce price by $500

        if ($hasAccidentHistory)

        {

            $salePrice -= 500;

        }

        echo "salePrice after accounting for past accidents: " . strval($salePrice),"\n";

        // 5. Based on additional miles driven

        $expectedMilesDriven = $ageOfCar * 10000.0;

        $additionalMiles = $milesDriven - $expectedMilesDriven;

        // a) if # miles over-driven is greater than 1000 AND less than or equal to 10000 then

        //        reduce sale price by 500

        if ($additionalMiles > 1000 && $additionalMiles <= 10000)

        {

            $salePrice -= 500;

        }

        else if ($additionalMiles > 10000 && $additionalMiles <= 30000)

        {

            $salePrice -= 1000;

        }

        else if ($additionalMiles > 30000)

        {

            $salePrice -= 1500;

        }

        echo "salePrice after accounting for miles driven: " . strval($salePrice),"\n";

        return $salePrice;

    }

    private function getPrice($makeAndModel, $yearManufactured)

    {

        if (strtolower($makeAndModel) == strtolower("ford ecosport"))

        {

            return 20000.0;

        }

        else if (strtolower($makeAndModel) == strtolower("honda city"))

        {

            return 25000.0;

        }

        else if (strtolower($makeAndModel) == strtolower("toyota camry hybrid"))

        {

            return 30000.0;

        }

        return 20000.0;

    }

    public static function main(&$args)

    {

        $carPriceEstimator = CarPriceEstimator::CarPriceEstimator();

        $salesPrice = $carPriceEstimator->getSalePrice("ford ecosport", 2018, 60000.0, 2, true, false, true, false, false, true);

    }

}

CarPriceEstimator::main($argv);

<?php
