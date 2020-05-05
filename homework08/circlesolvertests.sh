# rm test1results.txt
# ============================================================================
# filename: circlesolvertests.sh
# purpose: provide a unified test sequence for the CirlceSolver Integration Project
# @see http://bjohnson.lmu.build/cmsi186web/homework08.html for details
# ============================================================================

echo "running CircleSolver test harness for evaluation....." >> test1results.txt
echo ========================================================= >> test1results.txt

echo . >> test1results.txt
echo . >> test1results.txt
echo Running CircleSolver with no args
echo Running CircleSolver with no args >> test1results.txt
java CircleSolver >> test1results.txt
echo ========================================================= >> test1results.txt
echo . >> test1results.txt
echo . >> test1results.txt
echo Running CircleSolver with hope
echo Running CircleSolver with hope >> test1results.txt
java CircleSolver hope >> test1results.txt
echo ========================================================= >> test1results.txt
echo . >> test1results.txt
echo . >> test1results.txt
echo Running CircleSolver with 0
echo Running CircleSolver with 0 >> test1results.txt
java CircleSolver 0 >> test1results.txt
echo ========================================================= >> test1results.txt
echo . >> test1results.txt
echo . >> test1results.txt
echo Running CircleSolver with 30 20 10 30 30 20
echo Running CircleSolver with 30 20 10 30 30 20 >> test1results.txt
java CircleSolver 30 20 10 30 30 20 >> test1results.txt
echo ========================================================= >> test1results.txt
echo . >> test1results.txt
echo . >> test1results.txt
echo Running CircleSolver with 30 20 15 30 30 20
echo Running CircleSolver with 30 20 15 30 30 20 >> test1results.txt
java CircleSolver 30 20 15 30 30 20 >> test1results.txt
echo ========================================================= >> test1results.txt
echo . >> test1results.txt
echo . >> test1results.txt
echo Running CircleSolver with 30 35 3 30 30 10
echo Running CircleSolver with 30 35 3 30 30 10 >> test1results.txt
java CircleSolver 30 35 3 30 30 10 >> test1results.txt
echo ========================================================= >> test1results.txt
echo . >> test1results.txt
echo . >> test1results.txt
echo Running CircleSolver with 30 30 20 30 20 10
echo Running CircleSolver with 30 30 20 30 20 10 >> test1results.txt
java CircleSolver 30 30 20 30 20 10 >> test1results.txt
echo ========================================================= >> test1results.txt
echo . >> test1results.txt
echo . >> test1results.txt
echo Running CircleSolver with 30 30 20 30 20 15
echo Running CircleSolver with 30 30 20 30 20 15 >> test1results.txt
java CircleSolver 30 30 20 30 20 15 >> test1results.txt
echo ========================================================= >> test1results.txt
echo . >> test1results.txt
echo . >> test1results.txt
echo Running CircleSolver with 30 30 10 30 35 3
echo Running CircleSolver with 30 30 10 30 35 3 >> test1results.txt
java CircleSolver 30 30 10 30 35 3 >> test1results.txt
echo ========================================================= >> test1results.txt
echo . >> test1results.txt
echo . >> test1results.txt
echo Running CircleSolver with 10 10 10 10 10 10
echo Running CircleSolver with 10 10 10 10 10 10 >> test1results.txt
java CircleSolver 10 10 10 10 10 10 >> test1results.txt
echo ========================================================= >> test1results.txt
echo . >> test1results.txt
echo . >> test1results.txt
echo Running CircleSolver with 0 0 10 0 2 10
echo Running CircleSolver with 0 0 10 0 2 10 >> test1results.txt
java CircleSolver 0 0 10 0 2 10 >> test1results.txt
echo ========================================================= >> test1results.txt
echo . >> test1results.txt
echo . >> test1results.txt
echo Running CircleSolver with 10 10 10 20 20 10
echo Running CircleSolver with 10 10 10 20 20 10 >> test1results.txt
java CircleSolver 10 10 10 20 20 10 >> test1results.txt
echo ========================================================= >> test1results.txt
echo . >> test1results.txt
echo . >> test1results.txt
echo Running CircleSolver with 10 10 10 40 40 10
echo Running CircleSolver with 10 10 10 40 40 10 >> test1results.txt
java CircleSolver 10 10 10 40 40 10 >> test1results.txt
echo ========================================================= >> test1results.txt
echo . >> test1results.txt
echo . >> test1results.txt
echo Running CircleSolver with -100 150 30 -100 200 40
echo Running CircleSolver with -100 150 30 -100 200 40 >> test1results.txt
java CircleSolver -100 150 30 -100 200 40 >> test1results.txt
echo ========================================================= >> test1results.txt
echo . >> test1results.txt
echo . >> test1results.txt
echo Running CircleSolver with -100 150 20 100 150 40
echo Running CircleSolver with -100 150 20 100 150 40 >> test1results.txt
java CircleSolver -100 150 20 100 150 40 >> test1results.txt
echo ========================================================= >> test1results.txt
echo . >> test1results.txt
echo . >> test1results.txt
echo Running CircleSolver with 70 -80 20 75 -75 30
echo Running CircleSolver with 70 -80 20 75 -75 30 >> test1results.txt
java CircleSolver 70 -80 20 75 -75 30 >> test1results.txt
echo ========================================================= >> test1results.txt
echo . >> test1results.txt
echo . >> test1results.txt
echo Running CircleSolver with 50 60.5 14 51.5 54 16
echo Running CircleSolver with 50 60.5 14 51.5 54 16 >> test1results.txt
java CircleSolver 50 60.5 14 51.5 54 16 >> test1results.txt
echo ========================================================= >> test1results.txt
echo . >> test1results.txt
echo . >> test1results.txt
echo Running CircleSolver with -80.5 -40 20 -90 -100 40
echo Running CircleSolver with -80.5 -40 20 -90 -100 40 >> test1results.txt
java CircleSolver -80.5 -40 20 -90 -100 40 >> test1results.txt
echo ========================================================= >> test1results.txt
echo . >> test1results.txt
echo . >> test1results.txt
echo Running CircleSolver with f t 70 8 9 h
echo Running CircleSolver with f t 70 8 9 h >> test1results.txt
java CircleSolver f t 70 8 9 h >> test1results.txt
echo ========================================================= >> test1results.txt
echo . >> test1results.txt
echo . >> test1results.txt
echo Running CircleSolver with circle 6 7 5 6 8
echo Running CircleSolver with circle 6 7 5 6 8 >> test1results.txt
java CircleSolver circle 6 7 5 6 8 >> test1results.txt
echo ========================================================= >> test1results.txt
echo . >> test1results.txt
echo . >> test1results.txt
echo Running CircleSolver with 7 8 9
echo Running CircleSolver with 7 8 9 >> test1results.txt
java CircleSolver 7 8 9 >> test1results.txt
echo ========================================================= >> test1results.txt
echo . >> test1results.txt
echo . >> test1results.txt
echo Running CircleSolver with 0 0 0
echo Running CircleSolver with 0 0 0 >> test1results.txt
java CircleSolver 0 0 0 >> test1results.txt
echo ========================================================= >> test1results.txt
echo . >> test1results.txt
echo . >> test1results.txt
echo Running CircleSolver with 40 40 10 0 0 0
echo Running CircleSolver with 40 40 10 0 0 0 >> test1results.txt
java CircleSolver 40 40 10 0 0 0 >> test1results.txt
echo ========================================================= >> test1results.txt
echo . >> test1results.txt
echo . >> test1results.txt
echo Running CircleSolver with 50 50 0 
echo Running CircleSolver with 50 50 0  >> test1results.txt
java CircleSolver 50 50 0  >> test1results.txt
echo ========================================================= >> test1results.txt
echo . >> test1results.txt
echo . >> test1results.txt
echo Running CircleSolver with 50 50 0 55 55 0
echo Running CircleSolver with 50 50 0 55 55 0 >> test1results.txt
java CircleSolver 50 50 0 55 55 0 >> test1results.txt