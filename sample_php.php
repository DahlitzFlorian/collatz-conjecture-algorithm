<?php
require_once './cc_php.php';

$counter = CC_PHP::collatz_conjecture(3);
echo $counter;